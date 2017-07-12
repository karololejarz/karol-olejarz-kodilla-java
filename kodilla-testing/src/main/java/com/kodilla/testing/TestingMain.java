package com.kodilla.testing;

import com.kodilla.testing.calculator.*;
import java.util.*;

/**
 * Created by Karol Olejarz on 11.07.2017.
 */
public class TestingMain {

    public static final int CALCULATOR_EXCLUSIVE_UPPER_BOND = 100;

    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        System.out.println("6.1. Test sprawdzający kalkulator");
        Calculator result = new Calculator();

        Random a = new Random();
        Random b = new Random();

        for (int i=0; i<20; i++) {
            result.add(a.nextInt(CALCULATOR_EXCLUSIVE_UPPER_BOND), b.nextInt(CALCULATOR_EXCLUSIVE_UPPER_BOND));
            result.subtract(a.nextInt(CALCULATOR_EXCLUSIVE_UPPER_BOND), b.nextInt(CALCULATOR_EXCLUSIVE_UPPER_BOND));
        }
    }
}
