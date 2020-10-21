package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

import static week2.arrays.BasicArrays2.getRandomNumber;
import static week2.arraylists.FindingValueInArrayList.*;

public class WhereIsIt {

    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(getRandomNumber(50));
        }

        System.out.println("ArrayList: " + randomNumbers);

        Scanner scan = new Scanner(System.in);
        do {
            scan = new Scanner(System.in);
            System.out.print("Value to find: ");
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input");
            }
        } while (!scan.hasNextInt());

        System.out.println();

        findNumber(scan.nextInt(), randomNumbers, true);
    }

}
