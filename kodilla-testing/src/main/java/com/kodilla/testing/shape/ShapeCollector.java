package com.kodilla.testing.shape;

import java.util.*;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class ShapeCollector {
    HashSet<Figure> figureHashSet = new HashSet();

    public void addShape(Figure figure) {
        figureHashSet.add(figure);
    }

    public void removeShape(Figure figure) {
        figureHashSet.remove(figure);
    }

    public HashSet<Figure> showCollection() {
        for(Figure figure : figureHashSet) {
            System.out.println(figure.getFigureName() + " " + figure.getField());
        }
        return figureHashSet;
    }

}