package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverageOf(int[] numbers) {
        double average;
        System.out.println("Numbers " + Arrays.toString(numbers));
        average = IntStream.of(numbers).average().getAsDouble();
        System.out.println("The numbers' average is: " + average);
        return average;
    }

    static double getAverage(int[] numbers) {
        double average;
        IntStream.range(0, numbers.length).map(n -> numbers[n]).forEach(System.out::println);
        average = IntStream.range(0, numbers.length).map(n -> numbers[n]).average().getAsDouble();
        System.out.println("The numbers' average is: " + average);
        return average;
    }

}
