import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String[] wordArray = word.split("");
        Arrays.sort(wordArray);

        int counter = 1;

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < wordArray.length -1; i++) {
            if (wordArray[i].equals(wordArray[i + 1])) {
                counter++;
                continue;
            }
            if (counter > 1) {
                System.out.print(wordArray[i] + " = " + counter);
            }
        }
    }
}
