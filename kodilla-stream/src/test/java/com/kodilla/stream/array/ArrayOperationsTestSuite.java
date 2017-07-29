package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void TestAverage() {
        int[] numbers = {1, 2};
        Assert.assertEquals(1.5, ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void TestAverage0() {
        int[] numbers = {0, 0};
        Assert.assertEquals(0.0, ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void TestAverageN() {
        int[] numbers = {-1, -4};
        Assert.assertEquals(-2.5, ArrayOperations.getAverage(numbers),0.0);
    }

}
