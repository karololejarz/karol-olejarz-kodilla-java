package com.kodilla.exception.test;

public class FlightBrowserTest {

    public static void main(String[] args) throws RouteNotFoundException {
        FlightBrowser browser = new FlightBrowser();
        Flight rze = new Flight("RZE");
        Flight krk = new Flight("KRK");
        browser.createFlight(rze);
        browser.createFlight(krk);
        System.out.println(browser);

        browser.findFlight("RZE");
        browser.findFlight("WAR");
    }
}
