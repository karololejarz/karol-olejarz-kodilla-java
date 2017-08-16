package com.kodilla.good.patterns.flights;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlightsTest {

    @Test
    public void flightTest() throws RouteNotFoundException {
        FlightManager manager = new FlightManager();
        Flight flight001 = new Flight(001, "RZE", "KRK");
        Flight flight002 = new Flight(002, "WAR", "KRK");
        Flight flight003 = new Flight(003, "RZE", "WAR");
        Flight flight004 = new Flight(004, "KRK", "WAR");
        Flight flight005 = new Flight(005, "KRK", "WAR");
        manager.createFlight(flight001);
        manager.createFlight(flight002);
        manager.createFlight(flight003);
        manager.createFlight(flight004);
        manager.createFlight(flight005);
        HashMap<Integer, Flight> flightsMap = manager.getFlightsMap();
        System.out.println(flightsMap);

        List<Flight> expectedFlightsFromKRK = Arrays.asList(flight004,flight005);
        Assert.assertEquals(expectedFlightsFromKRK, manager.showFlightsFrom("KRK"));

        List<Flight> expectedFlightsToKRK = Arrays.asList(flight001,flight002);
        Assert.assertEquals(expectedFlightsToKRK, manager.showFlightsTo("KRK"));

        List<Flight> expectedTransitFlight = Arrays.asList(flight001,flight004, flight005);;
        Assert.assertEquals(expectedTransitFlight, manager.transitFlight("RZE","KRK", "WAR"));

    }

}
