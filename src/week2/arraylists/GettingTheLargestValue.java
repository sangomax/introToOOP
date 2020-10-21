package week2.arraylists;

import java.util.ArrayList;

import static week2.arrays.BasicArrays2.getRandomNumber;

public class GettingTheLargestValue {

    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(getRandomNumber(100));
        }

        System.out.println("ArrayList: " + randomNumbers);
        System.out.println();
        System.out.println("The largest value is " + getLargestNumber(randomNumbers));

    }

    public static int getLargestNumber(ArrayList<Integer> arrayNumbers) {
        int largest = arrayNumbers.get(0);
        for (int i = 1; i < arrayNumbers.size(); i++) {
            largest = Math.max(largest, arrayNumbers.get(i));
        }
        return largest;
    }
}
