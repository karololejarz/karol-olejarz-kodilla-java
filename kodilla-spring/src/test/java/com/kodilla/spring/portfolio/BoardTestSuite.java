package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        Assert.assertEquals(1,board.toDoList.tasks.size());
        Assert.assertEquals(1,board.inProgressList.tasks.size());
        Assert.assertEquals(1,board.doneList.tasks.size());
        Assert.assertEquals("toDo1",board.toDoList.tasks.get(0));
        Assert.assertEquals("inProgress1",board.inProgressList.tasks.get(0));
        Assert.assertEquals("done1",board.doneList.tasks.get(0));
    }
}
