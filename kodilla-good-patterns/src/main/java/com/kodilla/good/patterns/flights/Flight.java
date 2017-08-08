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
        return flightNumber == flight.flightNumber &&
                Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(destinationAirport, flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber);
    }
}
