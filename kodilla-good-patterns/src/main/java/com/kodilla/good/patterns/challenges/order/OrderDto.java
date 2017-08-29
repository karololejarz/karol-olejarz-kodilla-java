package com.kodilla.good.patterns.challenges.order;

public class OrderDto {

    public User user;
    public boolean isBought;

    public OrderDto(final User user, final boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }

}
