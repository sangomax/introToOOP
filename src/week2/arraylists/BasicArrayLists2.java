package week2.arraylists;

import java.util.ArrayList;
import java.util.List;

import static week2.arrays.BasicArrays2.getRandomNumber;

public class BasicArrayLists2 {

    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(getRandomNumber(100));
        }

        System.out.println("ArrayList: " + randomNumbers);

    }
}
