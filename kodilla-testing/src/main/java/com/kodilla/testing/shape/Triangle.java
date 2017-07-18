package com.kodilla.testing.shape;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class Triangle extends Figure {

    public String getFigureName() {
        return "Triangle";
    }

    private double base, height;
    public String name;

    public double getField() {

        double field = base * height / 2;

        if (base<0) {
            System.out.println("The base can't be negative");
        }

        else {

            if (height<0) {
                System.out.println("The height can't be negative");
            }

            else {
                System.out.println("The triangle's " + name + " field is: " + field);
            }

        }

        return field;
    }

    public Triangle (String name, double base, double height) {
        this.name = name;
        this.base = base;
        this.height = height;
    }

}
