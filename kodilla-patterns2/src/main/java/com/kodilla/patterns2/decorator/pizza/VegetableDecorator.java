package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegetableDecorator extends AbstractPizzaOrderDecorator {
    public VegetableDecorator(PizzaOrder order) {
        super(order);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.50));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + vegetable";
    }

}
