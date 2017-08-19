package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void makeNewBigmac() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .chooseRoll("Sesame bun")
                .countBurgers(1)
                .addIngredient("lettuce")
                .addIngredient("onions")
                .addIngredient("pickles")
                .addIngredient("cheddar cheese")
                .chooseSauce("mustard")
                .make();

        Assert.assertEquals("Sesame bun", bigmac.getRoll());
        Assert.assertEquals(1, bigmac.getBurgers());
        Assert.assertEquals(true, bigmac.getIngredients().contains("lettuce"));
        Assert.assertEquals(true, bigmac.getIngredients().contains("onions"));
        Assert.assertEquals(true, bigmac.getIngredients().contains("pickles"));
        Assert.assertEquals(true, bigmac.getIngredients().contains("cheddar cheese"));
        Assert.assertEquals(false, bigmac.getIngredients().contains("gorgonzola"));
        Assert.assertEquals("mustard", bigmac.getSauce());
    }
}
