package com.kodilla.stream.world;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testGetPeopleQuantity () {
        Country Cy1 = new Country("Cy1", BigDecimal.valueOf(1));
        Country Cy2 = new Country("Cy2", BigDecimal.valueOf(2));
        Country Cy3 = new Country("Cy3", BigDecimal.valueOf(3));
        Country Cy4 = new Country("Cy4", BigDecimal.valueOf(4));
        Country Cy5 = new Country("Cy5", BigDecimal.valueOf(5));
        Country Cy6 = new Country("Cy6", BigDecimal.valueOf(6));
        Country Cy7 = new Country("Cy7", BigDecimal.valueOf(7));
        Country Cy8 = new Country("Cy8", BigDecimal.valueOf(8));
        Country Cy9 = new Country("Cy9", BigDecimal.valueOf(9));

        ArrayList<Country> collection1 = new ArrayList<>();
        ArrayList<Country> collection2 = new ArrayList<>();
        ArrayList<Country> collection3 = new ArrayList<>();
        collection1.add(Cy1);
        collection1.add(Cy2);
        collection1.add(Cy3);
        collection2.add(Cy4);
        collection2.add(Cy5);
        collection2.add(Cy6);
        collection3.add(Cy7);
        collection3.add(Cy8);
        collection3.add(Cy9);
        Continent Ct1 = new Continent("Ct1",collection1);
        Continent Ct2 = new Continent("Ct2",collection2);
        Continent Ct3 = new Continent("Ct3",collection3);

        ArrayList<Continent> worldContinents = new ArrayList<>();
        worldContinents.add(Ct1);
        worldContinents.add(Ct2);
        worldContinents.add(Ct3);

        World world = new World("World", worldContinents);
        BigDecimal worldPopulation = world.getPeopleQuantity();

        /*6+15+24=45*/
        BigDecimal expectedPopulation = new BigDecimal("45");
        Assert.assertEquals(expectedPopulation, worldPopulation);
        System.out.println("Population of world is: " + worldPopulation);
        worldContinents.stream().forEach(System.out::println);
    }

        @Test
        public void testGetPeopleQuantity0 () {
            Country Cy1 = new Country("Cy1",BigDecimal.valueOf(0));
            Country Cy2 = new Country("Cy2",BigDecimal.valueOf(0));
            Country Cy3 = new Country("Cy3",BigDecimal.valueOf(0));
            Country Cy4 = new Country("Cy4",BigDecimal.valueOf(0));
            Country Cy5 = new Country("Cy5",BigDecimal.valueOf(0));
            Country Cy6 = new Country("Cy6",BigDecimal.valueOf(0));
            Country Cy7 = new Country("Cy7",BigDecimal.valueOf(0));
            Country Cy8 = new Country("Cy8",BigDecimal.valueOf(0));
            Country Cy9 = new Country("Cy9",BigDecimal.valueOf(0));

            ArrayList<Country> collection1 = new ArrayList<>();
            ArrayList<Country> collection2 = new ArrayList<>();
            ArrayList<Country> collection3 = new ArrayList<>();
            collection1.add(Cy1);
            collection1.add(Cy2);
            collection1.add(Cy3);
            collection2.add(Cy4);
            collection2.add(Cy5);
            collection2.add(Cy6);
            collection3.add(Cy7);
            collection3.add(Cy8);
            collection3.add(Cy9);
            Continent Ct1 = new Continent("Ct1",collection1);
            Continent Ct2 = new Continent("Ct2",collection2);
            Continent Ct3 = new Continent("Ct3",collection3);

            ArrayList<Continent> worldContinents = new ArrayList<>();
            worldContinents.add(Ct1);
            worldContinents.add(Ct2);
            worldContinents.add(Ct3);

            World world = new World("World",worldContinents);
            BigDecimal worldPopulation = world.getPeopleQuantity();

            BigDecimal expectedPopulation = new BigDecimal("0");
            Assert.assertEquals(expectedPopulation, worldPopulation);
            System.out.println("Population of world is: " + worldPopulation);
            worldContinents.stream().forEach(System.out::println);
    }
}