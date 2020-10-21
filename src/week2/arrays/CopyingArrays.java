package week2.arrays;

import static week2.arrays.BasicArrays2.*;

public class CopyingArrays {

    public static void main(String[] args) {

        Integer[] Array1 = new Integer[10];

        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = getRandomNumber(100);
        }

        Integer[] Array2 = Array1.clone();

        Array1[Array1.length - 1] = -7;

        printNumbers(Array1, 1);
        printNumbers(Array2, 2);

    }

    public static void printNumbers(Integer[] numbers, Object arrayCod) {
        System.out.print("Array" + (arrayCod != "" ? " " + arrayCod : arrayCod) + ": ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}
