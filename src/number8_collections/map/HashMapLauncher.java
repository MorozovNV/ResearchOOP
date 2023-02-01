package number8_collections.map;

import javax.sound.midi.Soundbank;
import java.util.*;

public class HashMapLauncher {
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>();//Map<key, value>
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter some text");
        String string = scanner.nextLine();

        String[] tokens = string.split(" ");
        for (String token: tokens) {
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if (count == null) {
                wordMap.put(word,1);
            } else {
                wordMap.put(word, count+1);
            }
        }
        printMap(wordMap);
        //

    }

    private static void printMap(Map<String, Integer> wordMap) {
        Set<String> keys = wordMap.keySet();
        for (String key: keys) {
            System.out.printf("%-10s%-10s \n", key, wordMap.get(key));
        }
    }
}
