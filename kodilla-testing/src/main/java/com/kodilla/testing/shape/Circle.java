package com.kodilla.testing.shape;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */

public class Circle extends Figure {

    private double radius;
    public final static double PI_4 = 3.1416;
    public String name;

    public String getFigureName () {
        return "Circle";
    }

    public double getField() {


        double field = PI_4 * Math.pow(radius, 2);

        if (radius<0) {
            System.out.println("The radius can't be negative");
        }

        return field;
    }

    public Circle (String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
}
