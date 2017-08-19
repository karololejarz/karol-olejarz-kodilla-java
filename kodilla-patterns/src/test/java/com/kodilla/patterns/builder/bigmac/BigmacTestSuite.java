package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void makeNewBigmac() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .chooseRoll(Rolls.Sesame)
                .countBurgers(1)
                .addIngredient(Ingredients.lettuce)
                .addIngredient(Ingredients.onion)
                .addIngredient(Ingredients.cheese)
                .chooseSauce(Sauces.barbecue)
                .make();

        Assert.assertEquals(Rolls.Sesame, bigmac.getRoll());
        Assert.assertEquals(1, bigmac.getBurgers());
        Assert.assertEquals(true, bigmac.getIngredients().contains(Ingredients.lettuce));
        Assert.assertEquals(true, bigmac.getIngredients().contains(Ingredients.onion));
        Assert.assertEquals(true, bigmac.getIngredients().contains(Ingredients.cheese));
        Assert.assertEquals(false, bigmac.getIngredients().contains(Ingredients.chilli));
        Assert.assertEquals(Sauces.barbecue, bigmac.getSauce());
    }
}
