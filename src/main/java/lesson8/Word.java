package lesson8;

import java.util.*;

public class Word {
    public Set<String> uniqueWords(String[] words) {
        return new TreeSet<>(Arrays.asList(words));
    }

    public Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else map.put(word, 1);
        }
        return map;
    }
}
