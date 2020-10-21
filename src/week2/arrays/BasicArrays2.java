package week2.arrays;

import java.util.Random;

public class BasicArrays2 {


    public static void main(String[] args) {

        Integer[] randomNumbers = new Integer[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = getRandomNumber(100);
        }

        printNumbers(randomNumbers);
    }

    public static Integer getRandomNumber(int maxNum) {
        Random random = new Random();
        Integer num = random.nextInt(maxNum);
        return num > 0 ? num : getRandomNumber(maxNum);
    }

    public static void printNumbers(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Slot " + i + " contains a " + numbers[i]);
        }
    }
}
