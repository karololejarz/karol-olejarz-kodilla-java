package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FishDecorator extends AbstractPizzaOrderDecorator {
    public FishDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.50));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + fish";
    }

}
