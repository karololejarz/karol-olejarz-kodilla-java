package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        try {
            SecondChallenge.probablyIWillThrowException(2.0, 1.5);
        }

        catch(Exception e) {
            System.out.println("Something went wrong");
        }

        finally {
            System.out.println("The action ended");
        }

    }

}
