package com.kodilla.good.patterns.flights;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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

        String expectedFlightsFromKRK = "[{No.4, from KRK to WAR}, {No.5, from KRK to WAR}]";
        Assert.assertEquals(expectedFlightsFromKRK, manager.showFlightsFrom("KRK"));

        String expectedFlightsToKRK = "[{No.1, from RZE to KRK}, {No.2, from WAR to KRK}]";
        Assert.assertEquals(expectedFlightsToKRK, manager.showFlightsTo("KRK"));

        String expectedTransitFlight = "[{No.1, from RZE to KRK}][{No.4, from KRK to WAR}, {No.5, from KRK to WAR}]";
        Assert.assertEquals(expectedTransitFlight, manager.transitFlight("RZE","KRK", "WAR"));

    }

}
