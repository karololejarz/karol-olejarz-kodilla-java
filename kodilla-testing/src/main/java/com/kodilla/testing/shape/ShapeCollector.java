package com.kodilla.testing.shape;

import java.util.*;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class ShapeCollector {
    ArrayList<Figure> figureArrayList = new ArrayList();

    public void addShape(Figure figure) {
        figureArrayList.add(figure);
    }

    public void removeShape(Figure figure) {
        figureArrayList.remove(figure);
    }

    public Figure getFigure (int position)  {
        return figureArrayList.get(position);
    }

    public ArrayList<Figure> showCollection() {
        for(Figure figure : figureArrayList) {
            System.out.println(figure.getFigureName() + " " + figure.getField());
        }
        return figureArrayList;
    }

    public ShapeCollector(ArrayList<Figure> figureArrayList) {
        this.figureArrayList = figureArrayList;
    }

    public ArrayList<Figure> getFigureArrayList() {
        return figureArrayList;
    }
}