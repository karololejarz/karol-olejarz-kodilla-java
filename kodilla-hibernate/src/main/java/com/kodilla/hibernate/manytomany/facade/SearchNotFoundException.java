package com.kodilla.hibernate.manytomany.facade;

public class SearchNotFoundException extends Exception {
    public SearchNotFoundException() {
        System.out.println("Search returned no results");
    }
}
