package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {

    int flightNumber;
    String departureAirport;
    String destinationAirport;

    public Flight(int flightNumber, String departureAirport, String destinationAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public String toString() {
        return "{" +
                "No." + flightNumber +
                ", from " + departureAirport +
                " to " + destinationAirport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNumber != flight.flightNumber) return false;
        if (!departureAirport.equals(flight.departureAirport)) return false;
        return destinationAirport.equals(flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        int result = flightNumber;
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + destinationAirport.hashCode();
        return result;
    }
}
