import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private final List<String> dictionary;

    public Dictionary(String fileName) throws IOException {
        this.dictionary = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            this.dictionary.add(reader.readLine().toLowerCase());
        }
    }

    public String getRandomWord() {
        Random random = new Random();
        return dictionary.get(random.nextInt(dictionary.size()));
    }

}
