package com.kodilla.testing.shape;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class Square extends Figure {

    public String getFigureName() {
        return "Square";
    }

    public double getField (double side) {

        double field = Math.pow(side, 2);

        if (side<0) {
            System.out.println("The side can't be negative");
        }

        else {
            System.out.println("The field is: " + field);
        }

        return field;
    }

    public Square (String name, double side) {
        System.out.println(getFigureName() + " named " + name + " side: " + side + " of area: " + getField(side));
    }

}
