package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class World {

    String worldName;
    ArrayList<Continent> continents = new ArrayList<>();

    public World(String worldName, ArrayList<Continent> continents) {
        this.worldName = worldName;
        this.continents = continents;
    }

    public String getWorldName() {
        return worldName;
    }

    public ArrayList<Continent> getContinents() {
        return continents;
    }

    @Override
    public String toString() {
        return "World{" +
                "worldName='" + worldName + '\'' +
                ", continents=" + continents +
                '}';
    }

    BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation = continents.stream()
            .flatMap(o->o.getCollection().stream()
                    .map(Country::getPopulation))
                    .reduce(BigDecimal.ZERO,BigDecimal::add);
        return worldPopulation;
    }
}
