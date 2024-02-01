import java.util.ArrayList;
import java.util.List;

public class HiddenWord {
    private final String word;
    private final List<String> hiddenWord;

    public HiddenWord(String word) {
        this.word = word;
        hiddenWord = new ArrayList<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            hiddenWord.add("_");
        }
    }

    public List<String> getHiddenWord() {
        return hiddenWord;
    }

    public void updateHiddenWord(String letter) {
        for (int i = 0; i < hiddenWord.size(); i++) {
            if (letter.equals(String.valueOf(word.charAt(i)))) {
                hiddenWord.set(i, String.valueOf(word.charAt(i)));
            }
        }
    }

    public void printHiddenWord() {
        System.out.println("\n Загаданное слово:");
        for (String s:
             hiddenWord) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }
}
