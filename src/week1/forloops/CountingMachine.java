package week1.forloops;

import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {
        int num = 0;

        Scanner scan = new Scanner(System.in);

        boolean flag = false;
        while (!flag) {
            System.out.print("Count to: ");
            String tempNum = scan.nextLine();
            if (isNumber(tempNum)) {
                num = Integer.parseInt(tempNum);
                flag = true;
            }
        }

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
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
