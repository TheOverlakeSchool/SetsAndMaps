import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner console = new Scanner(System.in);
        Scanner scanner = new Scanner(new File(args[0]));
        Map<String, Integer> words = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
        System.out.println("There are " + words.size() + " unique words in " + args[0]);
        while(true) {
            console.next();

            while (true) {
                System.out.print("Enter a search word: ");
                String word = console.next();
                if (word.equals("quit")) {
                    break;
                }
                if (words.containsKey(word)) {
                    System.out.println(word + " appears " + words.get(word) + " times");
                } else {
                    System.out.println(word + " does not appear in " + args[0]);
                }
            }
        }



    }
}
