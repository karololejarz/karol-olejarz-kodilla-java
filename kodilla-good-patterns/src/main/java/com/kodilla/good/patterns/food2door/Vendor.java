package com.kodilla.good.patterns.food2door;

public interface Vendor {
    boolean process(OrderRequest orderRequest);
    void deliver(OrderDto orderDto) throws ArrayIndexOutOfBoundsException;
    void createProduct(Product product);
}
