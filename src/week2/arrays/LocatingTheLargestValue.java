package week2.arrays;

import java.util.Arrays;

import static week2.arrays.BasicArrays2.getRandomNumber;
import static week2.arrays.CopyingArrays.printNumbers;
import static week2.arrays.FindingTheLargestValue.getLargestNumber;

public class LocatingTheLargestValue {

    public static void main(String[] args) {

        Integer[] randomNumbers = new Integer[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = getRandomNumber(100);
        }

        printNumbers(randomNumbers, "");

        int largest = getLargestNumber(randomNumbers);
        System.out.println();
        System.out.println("The largest value is " + largest);
        System.out.println("It is in slot " + Arrays.asList(randomNumbers).indexOf(largest));
    }
}
