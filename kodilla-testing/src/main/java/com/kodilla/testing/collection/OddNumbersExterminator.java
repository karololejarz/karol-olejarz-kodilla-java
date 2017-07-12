package com.kodilla.testing.collection;
import java.util.ArrayList;

/**
 * Created by Karol Olejarz on 12.07.2017.
 */
public class OddNumbersExterminator {
    ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> odd = new ArrayList<>();
        System.out.println("The integer list is: " + numbers);

        if(numbers.isEmpty()) {
            System.out.println("There are no numbers in collection");
        }

        else {
            for (int i:numbers) {
                if(i%2 != 0) {
                    odd.add(i);
                }
            }

            numbers.removeAll(odd);
            System.out.println("The even list: " + numbers);
        }

        return numbers;
    }
}
