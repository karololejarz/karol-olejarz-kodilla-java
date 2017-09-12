package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private Integer id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public Integer getId() {
        return id;
    }

    @NotNull
    @Column(name = "Product_Name")
    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}