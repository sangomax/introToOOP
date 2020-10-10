package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {

    public static void main(String[] args) {
        String name = new String();
        int age = 0;
        double sarary = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = scan.nextLine();

        boolean flag = false;
        while (!flag) {
            System.out.print("Ok, " + name + ", how old are you? ");
            String tempAge = scan.nextLine();
            if (isValidAge(tempAge)) {
                age = Integer.parseInt(tempAge);
                flag = true;
            }
        }

        System.out.println(searchIdealMessage(age));
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

    private static String searchIdealMessage(int age) {
        if ( age < 16) {
            return "You can't drive.";
        } else if (age >= 16 && age <= 17) {
            return "You can drive but not vote.";
        } else if (age >= 18 && age <= 24) {
            return "You can vote but not rent a car.";
        } else {
            return "You can do pretty much anything.";
        }
    }
}
