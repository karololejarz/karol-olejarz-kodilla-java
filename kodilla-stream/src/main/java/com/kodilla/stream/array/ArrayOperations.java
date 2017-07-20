package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static java.util.OptionalDouble getAverage(int[] numbers) {
        java.util.OptionalDouble average;
        average = IntStream.range(0, numbers.length).average();
        System.out.println(numbers);
        System.out.println("The average is: " + average);
        return average;
    }

}
