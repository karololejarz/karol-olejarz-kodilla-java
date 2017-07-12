package com.kodilla.testing.calculator;

/**
 * Created by Karol Olejarz on 12.07.2017.
 */
public class Calculator {

    public int add (int a, int b) {
       int sum = a + b;
       System.out.println("Suma " + a + " i " + b + " wynosi " + sum);
       return sum;
    }

    public int subtract (int a, int b) {
        int difference = b - a;
        System.out.println("Różnica " + b + " i " + a + " wynosi " + difference);
        return difference;
    }

}
