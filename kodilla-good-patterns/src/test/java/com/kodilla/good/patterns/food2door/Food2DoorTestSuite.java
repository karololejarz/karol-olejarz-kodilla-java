package com.kodilla.good.patterns.food2door;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class Food2DoorTestSuite {
    ExtraFoodShop efs = new ExtraFoodShop();
    GlutenFreeShop gfs = new GlutenFreeShop();
    HealthyShop hs = new HealthyShop();

    Product extra1 = new Product(1,"extra1",1.50);
    Product healthy1 = new Product(1,"healthy1", 3.00);
    Product glutenFree1 = new Product(1,"glutenFree1",4.50);

    Customer customer1 = new Customer("customer@customer.com");

    OrderRequest extra1request = new OrderRequest(1, customer1, extra1,5, LocalDateTime.now());
    OrderRequest healthy1request = new OrderRequest(1, customer1, healthy1,5, LocalDateTime.now());
    OrderRequest glutenFree1request = new OrderRequest(1, customer1, glutenFree1,5, LocalDateTime.now());

    @Test
    public void testOrders() {
        efs.createProduct(extra1);
        gfs.createProduct(glutenFree1);
        hs.createProduct(healthy1);

        Assert.assertEquals(true, efs.process(extra1request));
        Assert.assertEquals(true, gfs.process(glutenFree1request));
        Assert.assertEquals(true, hs.process(healthy1request));
        Assert.assertEquals(false, efs.process(glutenFree1request));
        Assert.assertEquals(false, gfs.process(extra1request));
        Assert.assertEquals(false, hs.process(extra1request));
        Assert.assertEquals(1, efs.getChallengingOrders().size());
        Assert.assertEquals(1, efs.getWishList().size());
    }

    @Test
    public void testDelivery() throws ArrayIndexOutOfBoundsException {
        efs.createProduct(extra1);
        gfs.createProduct(glutenFree1);
        hs.createProduct(healthy1);

        efs.process(extra1request);
        gfs.process(glutenFree1request);
        hs.process(healthy1request);

        efs.deliver(efs.getOrderList().get(0));
        gfs.deliver(gfs.getOrderList().get(0));
        hs.deliver(hs.getOrderList().get(0));

        Assert.assertEquals(true,efs.getOrderList().get(0).isDelivered());
        Assert.assertEquals(true,gfs.getOrderList().get(0).isDelivered());
        Assert.assertEquals(true,hs.getOrderList().get(0).isDelivered());

        //Handling delivering non-existing orders
        efs.deliver(hs.getOrderList().get(0));
        gfs.deliver(hs.getOrderList().get(0));
        hs.deliver(gfs.getOrderList().get(0));
    }
}
