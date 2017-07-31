package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        int[] numbers = new int[20];

        for (int i=0; i<10; i++) {
            numbers[i] = 1;
        }

        for (int i=10; i<20; i++) {
            numbers[i] = 2;
        }

        Assert.assertEquals(1.5, ArrayOperations.getAverage(numbers),0.0);
    }

}
