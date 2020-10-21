package week2.arrays;

import java.util.Scanner;

import static week2.arrays.BasicArrays2.getRandomNumber;
import static week2.arrays.CopyingArrays.printNumbers;

public class WhereIsIt {

    public static void main(String[] args) {

        Integer[] randomNumbers = new Integer[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = getRandomNumber(50);
        }

        printNumbers(randomNumbers, "");

        Scanner scan = new Scanner(System.in);
        do {
            scan = new Scanner(System.in);
            System.out.print("Value to find: ");
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input");

            }
        } while (!scan.hasNextInt());

        System.out.println();

        findNumber(scan.nextInt(), randomNumbers);
    }

    public static void findNumber(int num, Integer[] arrayNumbers) {
        int count = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == num) {
                printPosition(num, i);
                count++;
            }
        }
        if (count == 0) {
            printPosition(num, null);
        }
    }

    public static void printPosition(int num, Integer position) {
        if (position == null) {
            System.out.println(num + " is not in the array.");
        } else {
            System.out.println(num + " is in slot " + position + ".");
        }
    }
}
