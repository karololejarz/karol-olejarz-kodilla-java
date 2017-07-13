package com.kodilla.testing.shape;
import com.kodilla.testing.shape.*;
import org.junit.*;

/**
 * Created by Karol Olejarz on 13.07.2017.
 */
public class ShapeTestSuite {

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
    public void testCircleName() {
        System.out.println("Testing Circle name");
        Assert.assertEquals("Circle", testCircle.getFigureName());
    }

    @Test
    public void testCircleNegativeRadius() {
        System.out.println("Does a message for negative radius work?");
        testCircle.getField(-1);
    }

    @Test
    public void testCircleZeroRadius() {
        System.out.println("Testing with zero radius");
        Assert.assertEquals(0.0, testCircle.getField(0.0), 0.0);
    }

    @Test
    public void testSquareName() {
        System.out.println("Testing Square name");
        Assert.assertEquals("Square", testSquare.getFigureName());
    }

    @Test
    public void testSquareNegativeSide() {
        System.out.println("Does a message for negative side work?");
        testSquare.getField(-1);
    }

    @Test
    public void testCircleZeroSide() {
        System.out.println("Testing with zero side");
        Assert.assertEquals(0.0, testSquare.getField(0.0), 0.0);
    }

    @Test
    public void testTriangleName() {
        System.out.println("Testing Triangle name");
        Assert.assertEquals("Triangle", testTriangle.getFigureName());
    }

    @Test
    public void testTriangleNegativeBase() {
        System.out.println("Does a message for negative base work?");
        testTriangle.getField(-1, 5);
    }

    @Test
    public void testTriangleNegativeHeight() {
        System.out.println("Does a message for negative height work?");
        testTriangle.getField(5, -1);
    }

    @Test
    public void testTriangleZeroBase() {
        System.out.println("Testing with zero base");
        Assert.assertEquals(0.0, testTriangle.getField(0.0, 5.0), 0.0);
    }

    @Test
    public void testAddShape() {

        System.out.println("Adding four shapes: 2 Circles, Square, Triangle");
        collection.addShape(testCircle);
        collection.addShape(testCircle2);
        collection.addShape(testSquare);
        collection.addShape(testTriangle);
        collection.showCollection();
    }

    @Test
    public void removeShape() {

        System.out.println("Removing one circle");
        collection.addShape(testCircle);
        collection.addShape(testCircle2);
        collection.addShape(testSquare);
        collection.addShape(testTriangle);
        collection.removeShape(testCircle2);
        collection.showCollection();
    }

}
