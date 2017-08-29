package com.kodilla.good.patterns.challenges.order;

public class OrderServiceImpl implements OrderService {
    @Override
    public boolean order(User user, Product product) {
        System.out.println("There is an order from\n " + user + " for\n " + product);
        return true;
    }
}
