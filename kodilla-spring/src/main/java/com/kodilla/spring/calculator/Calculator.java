package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    private double result;

    double add(double a, double b) {
        result = a + b;
        display.displayValue(result);
        return result;
    }

    double sub(double b, double a) {
        result = b - a;
        display.displayValue(result);
        return result;
    }

    double mul(double a, double b) {
        result = a*b;
        display.displayValue(result);
        return result;
    }

    double div(double a, double b) {
        result = a/b;
        display.displayValue(result);
        return result;
    }

}
