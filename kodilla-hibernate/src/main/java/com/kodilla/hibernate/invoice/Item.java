package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    public Item() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "Product_Id")
    @NotNull
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "Price")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "Qty")
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    @Column(name = "Value")
    public BigDecimal getValue() {
        //BigDecimal quantity = BigDecimal.valueOf(getQuantity());
        //value = quantity.multiply(getPrice());
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "Invoice_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
