package com.kodilla.stream.forum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Man1", 'M', LocalDate.of(1990,06,07), 0));
        userList.add(new ForumUser(2, "Woman1", 'F', LocalDate.of(2000,06,07), 1));
        userList.add(new ForumUser(3, "Man2", 'M', LocalDate.of(1980,06,07), 1));
        userList.add(new ForumUser(4, "Man3", 'M', LocalDate.of(1980,06,07), 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
