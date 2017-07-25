package com.kodilla.stream.world;

import java.util.ArrayList;

public final class Continent {

    String continentName;
    ArrayList<Country> collection = new ArrayList<>();

    public Continent(String continentName, ArrayList<Country> collection) {
        this.continentName = continentName;
        this.collection = collection;
    }

    public String getContinentName() {
        return continentName;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + collection +
                '}';
    }

    public ArrayList<Country> getCollection() {
        return collection;
    }
}