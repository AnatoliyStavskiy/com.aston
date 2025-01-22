package lesson8;

import java.util.*;

public class Word {
    public List<String> uniqueWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }
        return list;
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
