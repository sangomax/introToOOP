package miniProjects.miniProject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HangmanCities {
    private String[] cities;
    private String wordGuess;

    public HangmanCities() {
        this.cities = readCitiesDoc();
        this.wordGuess = sortingCity(cities);
    }

    public void drawGame(String wordGuess, boolean flagFirst, int numError, char[] letterWrong) {

        if (flagFirst) {
            System.out.println("Here's the question.");
            System.out.println(wordGuess.replace(" ", "-").replace("\t"," ").replace("-","\t\t"));
        } else {
            System.out.println("You are guessing: " + wordGuess.replace(" ", "-").replace("\t"," ").replace("-","\t\t"));
            System.out.print("You have guessed (" + numError + ") wrong letters: ");
            for(char letter: letterWrong) System.out.print(letter + "\t");
            System.out.println();
        }

    }

    public void displayGame() {
        Scanner scan = new Scanner(System.in);
        int countError = 0;
        boolean flagGuess = false;
        boolean first = true;
        String lettersWrong = "";
        String wordToShow = prepareWordToShow(this.wordGuess);
        while (countError < 10 && !flagGuess) {
            drawGame(wordToShow, first, countError, lettersWrong.toCharArray());
            System.out.print("Guess a letter: ");
            String letterGuess = scan.nextLine();
            if (!letterGuess.matches("^[a-zA-Z]")) {
                System.out.println("Invalid character!");
                continue;
            }
            String wordChecked = checkGuess(letterGuess, wordToShow);
            if(wordChecked.equals(wordToShow)) {
                countError++;
                lettersWrong += letterGuess;
            } else if(validateGuess(wordChecked)) {
                System.out.println("You win!");
                System.out.println("You have guessed '" + this.wordGuess + "' correctly.");
                flagGuess = true;
                continue;
            } else {
                wordToShow = wordChecked;
            }
            if(first) first = false;
        }
        if(countError == 10) {
            System.out.print("You have guessed (" + countError + ") wrong letters: ");
            for(char letter: lettersWrong.toCharArray()) System.out.print(letter + "\t");
            System.out.println();
            System.out.println("You lose!");
            System.out.println("The correct word was '" + this.wordGuess + "' !");
        }
        System.out.println();
    }

    public String[] readCitiesDoc()  {
        File file = new File("src\\miniProjects\\miniProject1\\cities.txt");
        try {
            Scanner fileScan = new Scanner(file);
            String cities = "";
            while (fileScan.hasNextLine()) {
                cities += fileScan.nextLine() + "-";
            }
            return cities.split("-");
        } catch (FileNotFoundException e) {
            return new String[0];
        }
    }

    public String sortingCity(String[] cities){
        Random random = new Random();
        int indexSorted = random.nextInt(cities.length);
        return cities[indexSorted];
    }

    public String prepareWordToShow(String wordGuess) {
        String wordPrepared = "";
        for(char letter: wordGuess.toCharArray()) {
            wordPrepared += String.valueOf(letter) != " " ? "_\t" : " \t\t";
        }
        return wordPrepared;
    }

    public String checkGuess(String letterGuess, String wordToShow) {
        char[] arrayWord = this.wordGuess.toCharArray();
        String[] arrayWordToShow = wordToShow.split("\t");
        for(int i = 0; i < arrayWord.length; i++) {
            if(letterGuess.equalsIgnoreCase(String.valueOf(arrayWord[i]))) {
                arrayWordToShow[i] = String.valueOf(arrayWord[i]);
            }
        }
        wordToShow = "";
        for (String letter:arrayWordToShow) wordToShow += letter + "\t";

        return wordToShow;
    }

    public boolean validateGuess(String wordGuess) {
        String wordFormated = wordGuess.replace("\t","");

        return wordFormated.equals(this.wordGuess) ? true : false;
    }
}
