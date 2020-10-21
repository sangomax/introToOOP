package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

import static week2.arrays.BasicArrays2.getRandomNumber;

public class FindingValueInArrayList {

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

        findNumber(scan.nextInt(), randomNumbers, false);
    }

    public static void findNumber(int num, ArrayList<Integer> arrayNumbers, boolean flagPosition) {
        int count = 0;
        for (int i = 0; i < arrayNumbers.size(); i++) {
            if (arrayNumbers.get(i) == num) {
                if (flagPosition) {
                    printPosition(num, i);
                } else {
                    printPosition(num, null);
                }
                count++;
            }
        }
        if (count == 0 && flagPosition) {
            printPosition(num, -1);
        }
    }

    public static void printPosition(int num, Integer position) {
        if (position == null) {
            System.out.println(num + " is in the ArrayList.");

        } else if (position < 0) {
            System.out.println(num + " is not in the ArrayList.");

        } else {
            System.out.println(num + " is in slot " + position + ".");
        }
    }

}
