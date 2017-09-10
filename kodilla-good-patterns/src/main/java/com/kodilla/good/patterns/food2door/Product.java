package com.kodilla.good.patterns.food2door;

public class Product {
    private final int productNumber;
    private final String productName;
    private final ProductClass productClass;
    private final double price;

    public Product(int productNumber, String productName, ProductClass productClass, double price) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productClass = productClass;
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public ProductClass getProductClass() {
        return productClass;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", productClass=" + productClass +
                ", price=" + price +
                '}';
    }
}
