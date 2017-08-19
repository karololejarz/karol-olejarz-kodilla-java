package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final List<String> ingredients;
    private final String sauce;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();
        private String sauce;

        public BigmacBuilder chooseRoll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder countBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder addIngredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigmacBuilder chooseSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Bigmac make() {return new Bigmac(roll, burgers, ingredients, sauce);}

    }

    private Bigmac(final String roll, final int burgers, List<String> ingredients, final String sauce) {
        this.roll = roll;
        this.burgers = burgers;
        this.ingredients = ingredients;
        this.sauce = sauce;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}