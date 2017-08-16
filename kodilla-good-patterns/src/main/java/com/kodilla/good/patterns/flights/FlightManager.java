package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FlightManager {

    private HashMap<Integer, Flight> flightsMap = new HashMap<>();

    protected void createFlight (Flight flight) {
        flightsMap.put(flight.getFlightNumber(), flight);
    }

    protected HashMap<Integer, Flight> getFlightsMap() {
        return flightsMap;
    }

    protected String showFlightsFrom(String departureAirport) throws RouteNotFoundException {

        String flightsFrom = flightsMap.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList())
                .toString();

        return flightsFrom;
    }

    protected String showFlightsTo(String destinationAirport) throws RouteNotFoundException {
        String flightsTo = flightsMap.values().stream()
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList())
                .toString();

        /*
        Stream<Flight> valueStream = flightsMap.values().stream();
        Stream<Integer> keyStream = flightsMap.keySet().stream();

        HashMap<Integer, Flight> flightsTo = flightsMap.entrySet().stream()
                .filter(f->f.getValue().getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toMap(HashMap.Entry::getKey,HashMap.Entry::getValue));

        flightsMap.get... da zrobić K, ale nie da zrobić V
        getKey(), getValue() nie pokazuje
        */

        System.out.println("Flights to " + destinationAirport + " are " + flightsTo);
        return flightsTo;
    }

    protected String transitFlight(String departureAirport, String transitAirport, String destinationAirport) throws RouteNotFoundException {

        String transitFlights1 = flightsMap.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getDestinationAirport().equals(transitAirport))
                .collect(Collectors.toList())
                .toString();

        String transitFlights2 = flightsMap.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(transitAirport))
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList())
                .toString();

        String transitFlights = transitFlights1.concat(transitFlights2);

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