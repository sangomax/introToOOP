package miniProjects.miniProject1;


import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        HangmanCities hang = new HangmanCities();

        hang.displayGame();

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        System.out.println("Type \"Y\" to play again or anything to finish");
        String option = scan.nextLine();
        System.out.println();
        if (option.equalsIgnoreCase("y")) {
            main(new String[0]);
        }
    }

}
