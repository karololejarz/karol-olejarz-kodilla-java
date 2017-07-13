package com.kodilla.testing.shape;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class Triangle extends Figure {

    public String getFigureName() {
        return "Triangle";
    }

    public double getField (double base, double height) {

        double field = base * height / 2;

        if (base<0) {
            System.out.println("The base can't be negative");
        }

        else {

            if (height<0) {
                System.out.println("The height can't be negative");
            }

            else {
                System.out.println("The field is: " + field);
            }

        }

        return field;
    }

    public Triangle (String name, double base, double height) {
        System.out.println(getFigureName() + " named " + name + " base: " + base + " h: " + height + " of area : " + getField(base, height));
    }

}
