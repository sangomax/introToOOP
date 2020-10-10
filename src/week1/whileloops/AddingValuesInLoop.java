package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {

    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");

        boolean flag = true;
        while (flag) {
            System.out.print("Number: ");
            String tempNum = scan.nextLine();
            if (isNumber(tempNum)) {
                num = Integer.parseInt(tempNum);
                if (num == 0) {
                    flag = false;
                    continue;
                } else {
                    sum += num;
                }
            }
            System.out.println("The total so far is "+ sum );
        }

        System.out.println("\nThe total is " + sum + ".");

    }

    private static boolean isNumber(String num) {
        try{
            int numTemp = Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}
