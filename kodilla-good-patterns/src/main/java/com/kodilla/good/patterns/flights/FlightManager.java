package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FlightManager {

    private HashMap<Integer, String> flightsMap = new HashMap<>();

    protected void createFlight (Flight flight) {
        flightsMap.put(flight.getFlightNumber(), (flight.getDepartureAirport()+" to "+flight.getDestinationAirport()));
    }

    protected HashMap<Integer, String> getFlightsMap() {
        return flightsMap;
    }

    protected String showFlightsFrom(String departureAirport) throws RouteNotFoundException {
        String flightsFrom = flightsMap.values().stream()
                .filter(flight -> flight.startsWith(departureAirport))
                .collect(Collectors.toList())
                .toString();

        System.out.println("Flights from " + departureAirport + " are " + flightsFrom);
        return flightsFrom;
    }

    protected String showFlightsTo(String destinationAirport) throws RouteNotFoundException {
        String flightsFrom = flightsMap.values().stream()
                .filter(flight -> flight.endsWith(destinationAirport))
                .collect(Collectors.toList())
                .toString();

        System.out.println("Flights to " + destinationAirport + " are " + flightsFrom);
        return flightsFrom;
    }



    protected boolean checkFlightTo(String destinationAirport) throws RouteNotFoundException {

        boolean flag = false;
        for (String value : flightsMap.values()) {
            if (value.endsWith(destinationAirport)) {
                flag = true;
            }
        }

        if(flag) {
            System.out.println("There is a flight to " + destinationAirport);
            return true;
        }
        else {
            System.out.println("There is no flight to " + destinationAirport);
            throw new RouteNotFoundException();
        }
    }

    protected boolean checkFlightFrom(String departureAirport) throws RouteNotFoundException {

        boolean flag = false;
        for (String value : flightsMap.values()) {
            if (value.startsWith(departureAirport)) {
                flag = true;
            }
        }

        if(flag) {
            System.out.println("There is a flight from " + departureAirport);
            return true;
        }
        else {
            System.out.println("There is no flight from " + departureAirport);
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