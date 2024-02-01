import java.util.ArrayList;
import java.util.List;

public class Hangman {

    private final List<String> hangman = new ArrayList<>();
    {
        hangman.add(" __________");
        hangman.add(" |      |");
        hangman.add(" |      o");
        hangman.add(" |     /0\\");
        hangman.add(" |     / \\");
        hangman.add(" |");
        hangman.add(" _____");
    }

    public void printHangman(int err) {
        for (int i = 0; i < hangman.size(); i++) {
            String s = hangman.get(i);
            String strToPrint = s.substring(1);
            char partOfStr = s.charAt(1);
            switch (err) {
                case 1:
                    if (i == 6) {
                        System.out.println(strToPrint);
                    }
                    break;
                case 2:
                    if (i == 6) {
                        System.out.println(strToPrint);
                        continue;
                    }
                    System.out.println(partOfStr);
                    break;
                case 3:
                    if (i == 6 || i == 0) {
                        System.out.println(strToPrint);
                        continue;
                    }
                    System.out.println(partOfStr);
                    break;
                case 4:
                    if (i > 1 && i < 5) {
                        System.out.println(partOfStr);
                        continue;
                    }
                    System.out.println(strToPrint);
                    break;
                case 5:
                    if (i == 3 || i == 4) {
                        System.out.println(partOfStr);
                        continue;
                    }
                    System.out.println(strToPrint);
                    break;
                case 6:
                    if (i == 3) {
                        System.out.println(s.substring(1, s.length() - 2));
                        continue;
                    }
                    if (i == 4) {
                        System.out.println(partOfStr);
                        continue;
                    }
                    System.out.println(strToPrint);
                    break;
                case 7:
                    if (i == 3) {
                        System.out.println(s.substring(1, s.length() - 1));
                        continue;
                    }
                    if (i == 4) {
                        System.out.println(partOfStr);
                        continue;
                    }
                    System.out.println(strToPrint);
                    break;
                case 8:
                    if (i == 4) {
                        System.out.println(partOfStr);
                        continue;
                    }
                    System.out.println(strToPrint);
                    break;
                case 9:
                    if (i == 4) {
                        System.out.println(s.substring(1, s.length() - 2));
                        continue;
                    }
                    System.out.println(strToPrint);
                    break;
                case 10:
                    System.out.println(strToPrint);

            }
        }
    }
}
