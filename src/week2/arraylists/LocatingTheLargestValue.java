package week2.arraylists;

import java.util.ArrayList;

import static week2.arraylists.GettingTheLargestValue.getLargestNumber;
import static week2.arrays.BasicArrays2.getRandomNumber;

public class LocatingTheLargestValue {

    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(getRandomNumber(100));
        }

        System.out.println("ArrayList: " + randomNumbers);

        int largest = getLargestNumber(randomNumbers);
        System.out.println();
        System.out.println("The largest value is " + largest + ", which is in slot " + randomNumbers.indexOf(largest));
    }

}
