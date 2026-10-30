import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");

        String text = sc.nextLine().toLowerCase();

        String[] words = text.split("\\s+");

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
