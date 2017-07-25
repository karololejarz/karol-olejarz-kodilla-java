package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class World {

    ArrayList continents = new ArrayList<>();
    Continent1 continent1 = new Continent1();
    Continent2 continent2 = new Continent2();
    Continent3 continent3 = new Continent3();

    ArrayList collection() {
        continent1.collection();
        continent2.collection();
        continent3.collection();
        continents.add(continent1);
        continents.add(continent2);
        continents.add(continent3);
        return continents;
    }

    BigDecimal getPeopleQuantity() {
        collection();
        BigDecimal worldPopulation = continents.stream()
            .map(Country::getPopulation)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopulation;
    }
}
