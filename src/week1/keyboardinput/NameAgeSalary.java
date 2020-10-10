package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {
        String name = new String();
        int age = 0;
        double sarary = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello.  What is your name?");
        name = scan.nextLine();

        boolean flag = false;
        while (!flag) {
            System.out.println("Hi, " + name + "!  How old are you?");
            String tempAge = scan.nextLine();
            if (isValidAge(tempAge)) {
                age = Integer.parseInt(tempAge);
                flag = true;
            }
        }

        flag = false;
        while (!flag) {
            System.out.println("So you're " + age + ", eh?  That's not old at all!\n" +
                    "How much do you make, " + name + "?");
            String tempSalary = scan.nextLine();
            if (isValidSalary(tempSalary)) {
                sarary = Double.parseDouble(tempSalary);
                flag = true;
            }
        }

        System.out.println(sarary + "!  I hope that's per hour and not per year! LOL!");

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

    private static boolean isValidSalary(String salary) {
        try{
            double numSalary = Double.parseDouble(salary);
            return true;
        }catch (NumberFormatException e) {
            System.out.println("Invalid Salary!");
            return false;
        }
    }


}
