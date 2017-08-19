package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Rolls roll;
    private final int burgers;
    private final List<Ingredients> ingredients;
    private final Sauces sauce;

    public static class BigmacBuilder {
        private Rolls roll;
        private int burgers;
        private List<Ingredients> ingredients = new ArrayList<>();
        private Sauces sauce;

        public BigmacBuilder chooseRoll(Rolls roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder countBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder addIngredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigmacBuilder chooseSauce(Sauces sauce) {
            this.sauce = sauce;
            return this;
        }

        public Bigmac make() {return new Bigmac(roll, burgers, ingredients, sauce);}

    }

    private Bigmac(final Rolls roll, final int burgers, List<Ingredients> ingredients, final Sauces sauce) {
        this.roll = roll;
        this.burgers = burgers;
        this.ingredients = ingredients;
        this.sauce = sauce;
    }

    public Rolls getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public Sauces getSauce() {
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