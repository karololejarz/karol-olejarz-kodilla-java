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
        pizzaOrder = new FishDecorator(pizzaOrder);

        String orderDescription = pizzaOrder.getDescription();
        String expectedDescription = "Basic pizza (tomato souce + cheese) + vegetable + vegetable + meat + fish";
        BigDecimal orderCost = pizzaOrder.getCost().setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal expectedCost = new BigDecimal(15.00)
                .add(new BigDecimal(1.50)).add(new BigDecimal(1.50))
                .add(new BigDecimal(3.00)).add(new BigDecimal(4.50))
                .setScale(2, BigDecimal.ROUND_HALF_DOWN);

        Assert.assertEquals(expectedCost, orderCost);
        Assert.assertEquals(expectedDescription,orderDescription);
        System.out.println(orderDescription + " = " + orderCost);
    }

}
