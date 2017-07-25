package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class Continent1 {

    public ArrayList<Country> collection() {
        ArrayList<Country> collection = new ArrayList<>();
        Country C1 = new Country("C1",BigDecimal.valueOf(1));
        Country C2 = new Country("C2",BigDecimal.valueOf(2));
        Country C3 = new Country("C3",BigDecimal.valueOf(3));
        collection.add(C1);
        collection.add(C2);
        collection.add(C3);
        return collection;
    }
}