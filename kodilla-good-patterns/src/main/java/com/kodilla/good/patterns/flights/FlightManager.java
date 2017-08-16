package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightManager {

    private HashMap<Integer, Flight> flightsMap = new HashMap<>();

    protected void createFlight (Flight flight) {
        flightsMap.put(flight.getFlightNumber(), flight);
    }

    protected HashMap<Integer, Flight> getFlightsMap() {
        return flightsMap;
    }

    protected List<Flight> showFlightsFrom(String departureAirport) throws RouteNotFoundException {

        List<Flight> flightsFrom = flightsMap.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        return flightsFrom;
    }

    protected List<Flight> showFlightsTo(String destinationAirport) throws RouteNotFoundException {
        List<Flight> flightsTo = flightsMap.values().stream()
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());

        System.out.println("Flights to " + destinationAirport + " are " + flightsTo);
        return flightsTo;
    }

    protected ArrayList<Flight> transitFlight(String departureAirport, String transitAirport, String destinationAirport) throws RouteNotFoundException {

        List<Flight> transitFlights1 = flightsMap.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getDestinationAirport().equals(transitAirport))
                .collect(Collectors.toList());

        List<Flight> transitFlights2 = flightsMap.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(transitAirport))
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());

        ArrayList<Flight> transitFlights = new ArrayList<>(transitFlights1);
        transitFlights.addAll(transitFlights2);

        System.out.println("How to get to " + destinationAirport + " from " + departureAirport + " via " + transitAirport + " : " + transitFlights);
        return transitFlights;
    }


    @Override
    public String toString() {
        return "FlightBrowser{" +
                "flightsMap=" + flightsMap +
                '}';
    }
}