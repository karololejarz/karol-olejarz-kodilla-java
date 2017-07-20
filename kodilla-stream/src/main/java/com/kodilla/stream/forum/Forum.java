package com.kodilla.stream.forum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "User1", 'M', LocalDate.of(1990,06,07), 0));
        userList.add(new ForumUser(2, "User2", 'F', LocalDate.of(2000,06,07), 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
