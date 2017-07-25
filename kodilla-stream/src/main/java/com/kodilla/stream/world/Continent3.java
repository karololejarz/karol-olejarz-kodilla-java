package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class Continent3 {

    public ArrayList<Country> collection() {
        ArrayList<Country> collection = new ArrayList<>();
        Country C7 = new Country("C7",BigDecimal.valueOf(7));
        Country C8 = new Country("C8",BigDecimal.valueOf(8));
        Country C9 = new Country("C9",BigDecimal.valueOf(9));
        collection.add(C7);
        collection.add(C8);
        collection.add(C9);
        return collection;
    }
}