package com.kodilla.good.patterns.challenges.order;

public class User {

    public String login;

    public User(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                '}';
    }
}
