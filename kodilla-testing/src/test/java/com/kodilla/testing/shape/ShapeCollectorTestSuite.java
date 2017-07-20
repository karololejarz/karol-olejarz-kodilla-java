package com.kodilla.testing.shape;
import com.kodilla.testing.shape.*;
import org.junit.*;

import java.util.ArrayList;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class ShapeCollectorTestSuite {

    Circle testCircle = new Circle("C1", 1.0);
    Circle testCircle2 = new Circle("C2", 2.0);
    Square testSquare = new Square("S1", 1.0);
    Triangle testTriangle = new Triangle("T1", 1.0, 1.0);
    ArrayList<Figure> empty = new ArrayList<>();
    ShapeCollector collection = new ShapeCollector(empty);

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddAndRemoveShape() {
        System.out.println("Adding four shapes");
        collection.addShape(testCircle);
        collection.addShape(testCircle2);
        collection.addShape(testSquare);
        collection.addShape(testTriangle);
        Assert.assertEquals(4, collection.getFigureArrayList().size());
        collection.showCollection();
        System.out.println("Removing Circle 12.5664 from four shapes");
        collection.removeShape(testCircle2);
        Assert.assertEquals(3,collection.getFigureArrayList().size());
        collection.showCollection();
    }

    @Test
    public void getFourthShape() {
        System.out.println("Triangle should be the fourth shape");
        collection.addShape(testCircle);
        collection.addShape(testCircle2);
        collection.addShape(testSquare);
        collection.addShape(testTriangle);
        Assert.assertEquals(testTriangle, collection.getFigure(3));
    }

}
