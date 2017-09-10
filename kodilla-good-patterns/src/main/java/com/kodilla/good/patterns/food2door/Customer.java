package com.kodilla.good.patterns.food2door;

public class Customer {
    private String login;

    protected Customer(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "login='" + login + '\'' +
                '}';
    }
}
