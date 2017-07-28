package com.kodilla.exception.test;

public class Flight {

    String departureAirport;

    public Flight(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                '}';
    }
}
