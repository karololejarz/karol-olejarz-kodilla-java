package com.kodilla.testing.shape;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */

public class Circle extends Figure {

    public String getFigureName () {
        return "Circle";
    }

    public double getField(double radius) {
        double field;
        field = Math.PI * Math.pow(radius, 2);

        if (radius<0) {
            System.out.println("The radius can't be negative");
        }

        else {
            System.out.println("The field is: " + field);
        }

        return field;
    }

    public Circle (String name, double radius) {
        System.out.println(getFigureName() + " named " + name + " of radius: " + radius + " of area: " + getField(radius));
    }
}
