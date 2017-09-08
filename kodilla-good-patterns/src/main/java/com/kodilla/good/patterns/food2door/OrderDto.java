package com.kodilla.good.patterns.food2door;

public class OrderDto {
    private final OrderRequest order;
    private final boolean delivered;

    public OrderDto(OrderRequest order, boolean delivered) {
        this.order = order;
        this.delivered = delivered;
    }

    public OrderRequest getOrder() {
        return order;
    }

    public boolean isDelivered() {
        return delivered;
    }

}
