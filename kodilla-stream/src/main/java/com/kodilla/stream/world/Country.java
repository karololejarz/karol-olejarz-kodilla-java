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

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public BigDecimal getPopulation() {
        return population;
    }
}