package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String supplierName;
    private List<Product> suppliedProducts = new ArrayList<>();

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    protected void createProduct(Product product) {
        suppliedProducts.add(product);
    }

    public List<Product> getSuppliedProducts() {
        return suppliedProducts;
    }
}


