package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {

    public static void main(String[] args) {
        String name = new String();
        int age = 0;
        double sarary = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hello.  What is your name? ");
        name = scan.nextLine();
        System.out.println();

        boolean flag = false;
        while (!flag) {
            System.out.print("Hi, " + name + "!  How old are you? ");
            String tempAge = scan.nextLine();
            System.out.println();
            if (isValidAge(tempAge)) {
                age = Integer.parseInt(tempAge);
                flag = true;
            }
        }

        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?\n" +
                "And five years ago you were " + (age - 5) + "! Imagine that!");
    }

    private static boolean isValidAge(String age) {
        try{
            int numAge = Integer.parseInt(age);
            return true;
        }catch (NumberFormatException e) {
            System.out.println("Invalid Age!");
            return false;
        }
    }

}
