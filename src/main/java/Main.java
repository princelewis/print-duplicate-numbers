import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String[] wordArray = word.split("");
        Arrays.sort(wordArray);

        Set<String> setOfDuplicates = new HashSet<>();

        for (int i = 0; i < wordArray.length - 1 && i + 1 < wordArray.length; i++) {
            if (wordArray[i].equals(wordArray[i + 1])) {
                setOfDuplicates.add(wordArray[i]);
            }
        }

        setOfDuplicates.forEach(n -> System.out.println(n));
    }
}
