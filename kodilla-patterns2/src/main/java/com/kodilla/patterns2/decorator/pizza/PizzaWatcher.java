package com.kodilla.patterns2.decorator.pizza;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class PizzaWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaWatcher.class);

    @Before("execution(* com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator.getDescription(..))")
    public void logEvent() {
        LOGGER.info("Order has changed");
    }
}
