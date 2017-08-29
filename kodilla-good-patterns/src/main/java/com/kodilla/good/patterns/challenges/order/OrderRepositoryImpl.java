package com.kodilla.good.patterns.challenges.order;

public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product) {
        System.out.println("The order has been entered into system");
        return true;
    }
}
