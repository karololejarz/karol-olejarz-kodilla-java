package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class OrderRequest {

    private final int orderNumber;
    private final User user;
    private final Product product;
    private final int quantity;
    private final LocalDateTime submittedDate;
    private double totalPrice;

    public OrderRequest(int orderNumber, User user, Product product, int quantity, LocalDateTime submittedDate) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.user = user;
        this.quantity = quantity;
        this.submittedDate = submittedDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getSubmittedDate() {
        return submittedDate;
    }

    public double countTotalPrice() {
        totalPrice = quantity * product.getPrice();
        return totalPrice;
    }

    @Override
    public String toString() {
        return "[OrderRequest{" +
                "orderNumber= " + orderNumber +
                ", user=\n" + user +
                ", product=\n" + product +
                ",\nquantity=" + quantity +
                ", submittedDate=\n" + submittedDate +
                "\nTotal price: " + countTotalPrice() + "]";
    }
}
