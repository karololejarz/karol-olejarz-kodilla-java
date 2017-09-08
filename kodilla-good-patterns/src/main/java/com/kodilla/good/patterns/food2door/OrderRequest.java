package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequest {

    private final int orderNumber;
    private final Customer customer;
    private final Product product;
    private final int quantity;
    private final LocalDateTime submittedDate;
    private double totalPrice;

    public OrderRequest(int orderNumber, Customer customer, Product product, int quantity, LocalDateTime submittedDate) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        this.submittedDate = submittedDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
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
                ", customer=\n" + customer +
                ", product=\n" + product +
                ",\nquantity=" + quantity +
                ", submittedDate=\n" + submittedDate +
                "\nTotal price: " + countTotalPrice() + "]";
    }
}
