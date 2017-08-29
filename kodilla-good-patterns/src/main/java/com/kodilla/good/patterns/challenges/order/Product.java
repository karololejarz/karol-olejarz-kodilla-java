package com.kodilla.good.patterns.challenges.order;

public class Product {
    private final int productNumber;
    private final String productName;
    private final double price;

    public Product(int productNumber, String productName, double price) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
