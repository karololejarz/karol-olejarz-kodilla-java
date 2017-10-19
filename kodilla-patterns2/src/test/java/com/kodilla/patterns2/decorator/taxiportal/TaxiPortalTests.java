package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiPortalTests {
    @Test
    public void testGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        BigDecimal calculatedCost = order.getCost();
        Assert.assertEquals(new BigDecimal(5),calculatedCost);
    }
    @Test
    public void testGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        String description = order.getDescription();
        Assert.assertEquals("Drive a course",description);
    }
    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiOrderNetworkDecorator(order);
        BigDecimal cost = order.getCost();
        Assert.assertEquals(new BigDecimal(40), cost);
    }
    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiOrderNetworkDecorator(order);
        String description = order.getDescription();
        Assert.assertEquals("Drive a course by Taxi Network", description);
    }
    @Test
    public void testMyTaxiNetworkWithChildSeatGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkDecorator(order);
        order = new ChildSeatDecorator(order);
        BigDecimal cost = order.getCost();
        Assert.assertEquals(new BigDecimal(37), cost);
    }
    @Test
    public void testMyTaxiNetworkWithChildSeatGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new MyTaxiNetworkDecorator(order);
        order = new ChildSeatDecorator(order);
        String description = order.getDescription();
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }
    @Test
    public void testUberNetworkWithTwoChildSeatsGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new UberNetworkTaxiDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);
        BigDecimal cost = order.getCost();
        Assert.assertEquals(new BigDecimal(29), cost);
    }
    @Test
    public void testUberNetworkWithTwoChildSeatsGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new UberNetworkTaxiDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);
        String description = order.getDescription();
        Assert.assertEquals("Drive a course by Uber Network + child seat + child seat", description);
    }
}
