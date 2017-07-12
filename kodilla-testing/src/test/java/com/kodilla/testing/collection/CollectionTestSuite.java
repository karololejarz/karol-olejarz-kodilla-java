package com.kodilla.testing.collection;
import com.kodilla.testing.collection.*;
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

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(75);
        numbers.add(89);
        numbers.add(10);
        numbers.add(86);
        numbers.add(26);
        numbers.add(61);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(10);
        expected.add(86);
        expected.add(26);

        OddNumbersExterminator one = new OddNumbersExterminator();
        /*No Message as there is default good coverage of errors
         java.lang.AssertionError:
         Expected :[10, 86, 26]
         Actual   :[10, 86, 6]*/
        Assert.assertEquals(one.exterminate(numbers), expected);

    }

}