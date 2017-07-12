package com.kodilla.testing;

import com.kodilla.testing.calculator.*;

/**
 * Created by Karol Olejarz on 11.07.2017.
 */
public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        System.out.println("6.1. Test sprawdzający kalkulator");
        Calculator result = new Calculator();

        long test1 = result.add(5, -5);
        if (test1==0) {
            System.out.println("Test no.1 passed");
        }
        else {
            System.out.println("Test no.1 failed");
        }

        long test2 = result.add(0, 0);
        if (test2==0) {
            System.out.println("Test no.2 passed");
        }
        else {
            System.out.println("Test no.2 failed");
        }

        long test3 = result.subtract(-5, 5);
        if (test3==10) {
            System.out.println("Test no.3 passed");
        }
        else {
            System.out.println("Test no.3 failed");
        }

        long test4 = result.subtract(0, 10);
        if (test4==10) {
            System.out.println("Test no.4 passed");
        }
        else {
            System.out.println("Test no.4 failed");
        }
    }
}
