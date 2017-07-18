package com.kodilla.testing.shape;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class Square extends Figure {

    private double side;
    public String name;

    public String getFigureName() {
        return "Square";
    }

    public double getField () {

        double field = Math.pow(side, 2);

        if (side<0) {
            System.out.println("The side can't be negative");
        }

        else {
            System.out.println("The square's " + name + " field is: " + field);
        }

        return field;
    }

    public Square (String name, double side) {
        this.name = name;
        this.side = side;
    }

}
