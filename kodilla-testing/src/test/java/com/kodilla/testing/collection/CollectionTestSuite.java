package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;

/**
 * Created by Karol Olejarz on 12.07.2017.
 */
public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator one = new OddNumbersExterminator();
        one.exterminate(numbers);
    }

    public static final int EXCLUSIVE_UPPER_BOND = 100;

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randomize = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(randomize.nextInt(EXCLUSIVE_UPPER_BOND));
        }

        OddNumbersExterminator one = new OddNumbersExterminator();
        one.exterminate(numbers);
    }

}