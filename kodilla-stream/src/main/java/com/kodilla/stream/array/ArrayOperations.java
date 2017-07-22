package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        double average;
        average = IntStream.range(0,numbers.length).average().getAsDouble();
        System.out.println("The numbers' average is: " + average);
        return average;
    }

}
