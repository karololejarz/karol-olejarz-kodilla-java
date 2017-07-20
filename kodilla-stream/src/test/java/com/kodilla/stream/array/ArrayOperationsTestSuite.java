package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage1n() {
        int[] numbers = {0};
        Assert.assertEquals(0.0,ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void testGetAverage2n() {
        int[] numbers = {0,1};
        Assert.assertEquals(0.5,ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void testGetAverage3n() {
        int[] numbers = {0,1,2};
        Assert.assertEquals(1.0,ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void testGetAverage4n() {
        int[] numbers = {0,1,2,3};
        Assert.assertEquals(1.5,ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void testGetAverage5n() {
        int[] numbers = {0,1,2,3,4};
        Assert.assertEquals(2.0,ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void testGetAverage6n() {
        int[] numbers = {0,1,2,3,4,5};
        Assert.assertEquals(2.5,ArrayOperations.getAverage(numbers),0.0);
    }
}
