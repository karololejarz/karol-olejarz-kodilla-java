package com.kodilla.testing.shape;

import java.util.*;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class ShapeCollector {
    HashSet<Figure> figureHashSet = new HashSet();
    Iterator<Figure> itr = figureHashSet.iterator();

    public void addShape(Figure shape) {
        figureHashSet.add(shape);
    }

    public void removeShape(Figure shape) {
        figureHashSet.remove(shape);
    }

    public void showCollection() {
        /*while(itr.hasNext()) {
            System.out.println(itr.next());
        } kompiluje, nie zwraca*/
        System.out.println(figureHashSet);
        System.out.println(figureHashSet.size() + " shapes");
    }

}