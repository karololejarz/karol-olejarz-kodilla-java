package com.kodilla.testing.shape;
import com.kodilla.testing.shape.*;
import org.junit.*;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class ShapeCollectorTestSuite {

    Circle testCircle = new Circle("C1", 1.0);
    Circle testCircle2 = new Circle("C2", 2.0);
    Square testSquare = new Square("S1", 1.0);
    Triangle testTriangle = new Triangle("T1", 1.0, 1.0);
    ShapeCollector collection = new ShapeCollector();

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddShape() {

        System.out.println("Adding four shapes: 2 Circles, Square, Triangle");
        collection.addShape(testCircle);
        collection.addShape(testCircle2);
        collection.addShape(testSquare);
        collection.addShape(testTriangle);
        Assert.assertEquals(4,collection.showCollection().size());
    }

    @Test
    public void testRemoveShape() {

        System.out.println("Adding four shapes: 2 Circles, Square, Triangle");
        collection.addShape(testCircle);
        collection.addShape(testCircle2);
        collection.addShape(testSquare);
        collection.addShape(testTriangle);
        System.out.println("Removing one circle");
        collection.removeShape(testCircle2);
        Assert.assertEquals(3,collection.showCollection().size());
    }

}
