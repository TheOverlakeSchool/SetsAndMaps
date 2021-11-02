import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("input file");
        Scanner console = new Scanner(System.in);
        Scanner scanner = new Scanner(new File(console.next()));
        Map<String, Integer> words = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
        System.out.println("# of unique words: " + words.size());

    }
}
