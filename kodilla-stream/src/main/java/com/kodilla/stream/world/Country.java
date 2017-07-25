package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    String name;
    BigDecimal population;

    public Country(String name, BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPopulation() {
        return population;
    }
}