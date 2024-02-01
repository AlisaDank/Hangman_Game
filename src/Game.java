import java.io.IOException;
import java.util.*;

public class Game {
    public static Scanner answer = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Начать новую игру?   Д/Н");
            if (answer.hasNext("[ДНдн]")) {
                if (answer.nextLine().equalsIgnoreCase("н")) break;
                else {
                    try {
                        gameProcess();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else answer.next();
        }
    }

    public static void gameProcess() throws IOException {
        Hangman hangman = new Hangman();
        Dictionary dictionary = new Dictionary("Dictionary");
        String gameWord = dictionary.getRandomWord();
        HiddenWord hiddenWord = new HiddenWord(gameWord);
        int errorCount = 0;
        Set<String> usedLetters = new HashSet<>();

        while (true) {
            System.out.println("Введите любую букву от а до я:");
            if (answer.hasNext("[А-Яа-я]")) {
                String letter = answer.nextLine().toLowerCase();
                if (!gameWord.contains(letter) && !usedLetters.contains(letter)) {
                    errorCount++;
                } else {
                    hiddenWord.updateHiddenWord(letter);
                }
                usedLetters.add(letter);
            } else answer.next();

            hangman.printHangman(errorCount);
            hiddenWord.printHiddenWord();

            if (errorCount == 10) {
                System.out.println("Game over!");
                break;
            } else if (!hiddenWord.getHiddenWord().contains("_")) {
                System.out.println("You are win!");
                break;
            }
        }
    }



}
