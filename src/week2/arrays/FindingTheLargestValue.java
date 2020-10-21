package week2.arrays;

import static week2.arrays.BasicArrays2.getRandomNumber;
import static week2.arrays.CopyingArrays.printNumbers;

public class FindingTheLargestValue {

    public static void main(String[] args) {

        Integer[] randomNumbers = new Integer[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = getRandomNumber(100);
        }

        printNumbers(randomNumbers, "");
        System.out.println();
        System.out.println("The largest value is " + getLargestNumber(randomNumbers));

    }

    public static int getLargestNumber(Integer[] arrayNumbers) {
        int largest = arrayNumbers[0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            largest = Math.max(largest, arrayNumbers[i]);
        }
        return largest;
    }
}
