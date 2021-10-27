import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("input file");
        Scanner console = new Scanner(System.in);
        Scanner scanner = new Scanner(new File(console.next()));
        Set<String> words = new HashSet<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        System.out.println("# of unique words: " + words.size());

    }
}
