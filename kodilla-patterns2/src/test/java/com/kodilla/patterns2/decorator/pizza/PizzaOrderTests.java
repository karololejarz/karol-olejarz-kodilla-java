package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTests {
    @Test
    public void testCombinedOrder() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new VegetableDecorator(pizzaOrder);
        pizzaOrder = new VegetableDecorator(pizzaOrder);
        pizzaOrder = new MeatDecorator(pizzaOrder);
        BigDecimal orderCost = pizzaOrder.getCost();
        String orderDescription = pizzaOrder.getDescription();
        //Decimal is an overkill here!
        BigDecimal expectedCost = new BigDecimal(15.00)
                .add(new BigDecimal(3.00)).add(new BigDecimal(1.49).add(new BigDecimal(1.49)));
        Assert.assertEquals(expectedCost, orderCost);
        Assert.assertEquals("Basic pizza (tomato souce + cheese) + vegetable + vegetable + meat",orderDescription);
        System.out.println(orderDescription + " = " + orderCost);
    }

}
