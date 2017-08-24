package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }
    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        /*
        CREATE TABLE USERS (
            ID SERIAL PRIMARY KEY,
            FIRSTNAME VARCHAR(100),
            LASTNAME VARCHAR(100));

        CREATE TABLE POSTS (
            ID SERIAL PRIMARY KEY,
            USER_ID BIGINT UNSIGNED NOT NULL,
            BODY VARCHAR(1024),
            FOREIGN KEY (USER_ID) REFERENCES USERS(ID));

        INSERT INTO USERS (FIRSTNAME, LASTNAME) VALUES ("John", "Smith");
        INSERT INTO POSTS (USER_ID, BODY) VALUES (1, "This is my first post on this forum!");
        INSERT INTO USERS (FIRSTNAME, LASTNAME) VALUES ("Zachary", "Lee");
        INSERT INTO USERS (FIRSTNAME, LASTNAME) VALUES ("Stephanie", "Kovalsky");
        INSERT INTO USERS (FIRSTNAME, LASTNAME) VALUES ("Thomas", "Landgren");
        INSERT INTO USERS (FIRSTNAME, LASTNAME) VALUES ("John", "Thomson");
        INSERT INTO POSTS (USER_ID, BODY) VALUES (2, "This is my first post too!");
        INSERT INTO POSTS (USER_ID, BODY) VALUES (2, "How are you?");
        INSERT INTO POSTS (USER_ID, BODY) VALUES (1, "Quite good, thanks bro!");
        INSERT INTO POSTS (USER_ID, BODY) VALUES (4, "Yo all! Here is Thomas!");
        COMMIT;
        */

        /*
        Zadanie 12.5.
        insert into POSTS VALUES (6,1,"posttext");
        update POSTS set body = "To delete" where id = 6;
        delete from POSTS where id = 6;
        commit;
        */

        //When
        String sqlQuery = "select COUNT(*) AS POSTS, U.LASTNAME, U.FIRSTNAME\n" +
                "from posts P, users U\n" +
                "where P.USER_ID = U.ID\n" +
                "group by P.USER_ID\n" +
                "having COUNT(*) >= 2\n" +
                "order by POSTS DESC, U.LASTNAME DESC, U.FIRSTNAME DESC;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println("Posts: " + rs.getInt("POSTS") + ", from: " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getString("FIRSTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}