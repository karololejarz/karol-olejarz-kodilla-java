package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class Continent2 {

    public ArrayList<Country> collection() {
        ArrayList<Country> collection = new ArrayList<>();
        Country C4 = new Country("C4",BigDecimal.valueOf(4));
        Country C5 = new Country("C5",BigDecimal.valueOf(5));
        Country C6 = new Country("C6",BigDecimal.valueOf(6));
        collection.add(C4);
        collection.add(C5);
        collection.add(C6);
        return collection;
    }
}