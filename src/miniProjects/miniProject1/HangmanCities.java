package miniProjects.miniProject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HangmanCities {
    private String[] cities;
    private String sortedWord;

    public HangmanCities() {
        this.cities = readCitiesDoc();
        this.sortedWord = sortingCity(cities);
    }

    private void drawGame(String sortedWord, boolean flagFirst, int numError, char[] letterWrong) {

        if (flagFirst) {
            System.out.println("Here's the question.");
            System.out.println(sortedWord.replace(" ", "-").replace("\t", " ").replace("-", " "));
        } else {
            System.out.println("You are guessing: " + sortedWord.replace(" ", "-").replace("\t", " ").replace("-", " "));
            System.out.print("You have guessed (" + numError + ") wrong letters: ");
            for (char letter : letterWrong) System.out.print(letter + "\t");
            System.out.println();
        }

    }

    public void displayGame() {
        Scanner scan = new Scanner(System.in);
        int countError = 0;
        boolean flagGuess = false;
        boolean first = true;
        String lettersWrong = "";
        String wordToShow = prepareWordToShow(this.sortedWord);
        while (countError < 10 && !flagGuess) {
            drawGame(wordToShow, first, countError, lettersWrong.toCharArray());
            System.out.print("Guess a letter: ");
            String letterGuess = scan.nextLine();
            if (!letterGuess.matches("^[a-zA-Z]")) {
                System.out.println("Invalid character!");
                continue;
            } else if (wordToShow.contains(letterGuess) || lettersWrong.contains(letterGuess)) {
                System.out.println("The letter has already been typed, try another");
                continue;
            }
            String wordChecked = checkGuess(letterGuess, wordToShow);
            if (wordChecked.equals(wordToShow)) {
                countError++;
                lettersWrong += letterGuess;
            } else if (validateGuess(wordChecked)) {
                System.out.println("You win!");
                System.out.println("You have guessed '" + this.sortedWord + "' correctly.");
                flagGuess = true;
                continue;
            } else {
                wordToShow = wordChecked;
            }
            if (first) first = false;
        }
        if (countError == 10) {
            System.out.print("You have guessed (" + countError + ") wrong letters: ");
            for (char letter : lettersWrong.toCharArray()) System.out.print(letter + "\t");
            System.out.println();
            System.out.println("You lose!");
            System.out.println("The correct word was '" + this.sortedWord + "' !");
        }
        System.out.println();
    }

    private String[] readCitiesDoc() {
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

    private String sortingCity(String[] cities) {
        Random random = new Random();
        int indexSorted = random.nextInt(cities.length);
        return cities[indexSorted];
    }

    private String prepareWordToShow(String wordGuess) {
        String wordPrepared = "";
        for (char letter : wordGuess.toCharArray()) {
            wordPrepared += !String.valueOf(letter).equals(" ") ? "_\t" : " \t";
        }
        return wordPrepared;
    }

    private String checkGuess(String letterGuess, String wordToShow) {
        char[] arrayWord = this.sortedWord.toCharArray();
        String[] arrayWordToShow = wordToShow.split("\t");
        for (int i = 0; i < arrayWord.length; i++) {
            if (letterGuess.equalsIgnoreCase(String.valueOf(arrayWord[i]))) {
                arrayWordToShow[i] = String.valueOf(arrayWord[i]);
            }
        }
        wordToShow = "";
        for (String letter : arrayWordToShow) wordToShow += letter + "\t";

        return wordToShow;
    }

    private boolean validateGuess(String wordGuess) {
        String wordFormated = wordGuess.replace("\t", "");

        return wordFormated.equals(this.sortedWord) ? true : false;
    }
}
