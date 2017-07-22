package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage0() {
        int[] numbers = {0,0,0};
        Assert.assertEquals(0.0,ArrayOperations.getAverage(numbers),0.0);
    }

    @Test
    public void testGetAverage55() {
        int[] numbers = {0,11};
        Assert.assertEquals(5.5,ArrayOperations.getAverage(numbers),0.0);
    }
}
