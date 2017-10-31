package com.kodilla.patterns2.decorator.pizza;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
    @Override
    public String getDescription() {
        return "Basic pizza (tomato souce + cheese)";
    }
}
