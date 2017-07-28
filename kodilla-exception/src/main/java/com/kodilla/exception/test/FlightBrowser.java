package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightBrowser {

    HashMap<String, Boolean> flightsMap = new HashMap<>();

    public void createFlight (Flight flight) {
        flightsMap.put(flight.getDepartureAirport(), true);
    }

    public HashMap<String, Boolean> getFlightsMap() {
        return flightsMap;
    }

    public void findFlight(String departureAirport) throws RouteNotFoundException {

        if(flightsMap.keySet().contains(departureAirport)) {
            System.out.println("There is a flight to " + departureAirport);
        }

        else {
            try {
                throw new RouteNotFoundException();
            } catch (RouteNotFoundException r) {
                System.out.println("There is no flight to " + departureAirport);
            }
        }
    }

    @Override
    public String toString() {
        return "FlightBrowser{" +
                "flightsMap=" + flightsMap +
                '}';
    }
}