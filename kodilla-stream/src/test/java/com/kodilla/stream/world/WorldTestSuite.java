package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetSandBeansQuantityWithReduce() {

        /*6+15+24=45*/
        BigDecimal expectedPopulation = new BigDecimal("45");
        Assert.assertEquals(expectedPopulation, worldPopulation);
    }
}