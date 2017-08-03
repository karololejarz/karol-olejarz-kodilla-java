package com.kodilla.good.patterns.flights;

import org.junit.Test;

public class FlightsTest {

    @Test
    public void flightTest() {
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
        System.out.println(manager);

        try {
            manager.showFlightsFrom("KRK");
        }
        catch (RouteNotFoundException e)         {
            System.out.println("There is an exception");
        }
        finally {
            System.out.println("Search ended");
        }

        try {
            manager.showFlightsTo("KRK");
        }
        catch (RouteNotFoundException e)         {
            System.out.println("There is an exception");
        }
        finally {
            System.out.println("Search ended");
        }

        try {
            manager.transitFlight("RZE","KRK", "WAR");
        }
        catch (RouteNotFoundException e)         {
            System.out.println("There is an exception");
        }
        finally {
            System.out.println("Search ended");
        }


    }

}
