package com.kodilla.exception.test;

public class FlightBrowserTest {

    public static void main(String[] args) {
        FlightBrowser browser = new FlightBrowser();
        Flight rze = new Flight("RZE");
        Flight krk = new Flight("KRK");
        browser.createFlight(rze);
        browser.createFlight(krk);
        System.out.println(browser);

        try {
            browser.findFlight("RZE");
        }
        catch (RouteNotFoundException e)         {
            System.out.println("There is an exception");
        }
        finally {
            System.out.println("Search ended");
        }

        try {
            browser.findFlight("WAR");
        }
        catch (RouteNotFoundException e) {
            System.out.println("This is an exception");
        }
        finally {
            System.out.println("Search ended");
        }
    }
}
