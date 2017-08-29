package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public interface OrderRepository {

    public boolean createOrder(User user, Product product);

}
