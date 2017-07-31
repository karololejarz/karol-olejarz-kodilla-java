package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightBrowser {

    private HashMap<String, Boolean> flightsMap = new HashMap<>();

    protected void createFlight (Flight flight) {
        flightsMap.put(flight.getDepartureAirport(), true);
    }

    protected HashMap<String, Boolean> getFlightsMap() {
        return flightsMap;
    }

    protected boolean findFlight(String departureAirport) throws RouteNotFoundException {

        if(flightsMap.keySet().contains(departureAirport)) {
            System.out.println("There is a flight to " + departureAirport);
            return true;
        }
        else {
            System.out.println("There is no flight to " + departureAirport);
            throw new RouteNotFoundException();
        }
    }

    @Override
    public String toString() {
        return "FlightBrowser{" +
                "flightsMap=" + flightsMap +
                '}';
    }
}