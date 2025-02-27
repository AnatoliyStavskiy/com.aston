package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    Map<String, ArrayList<String>> map = new HashMap<>();

    public PhoneDirectory add(String key, String phoneNumber) {
        if (map.containsKey(key)) {
            map.get(key).add(phoneNumber);
        }else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phoneNumber);
            map.put(key, list);
        }
        return this;
    }

    public PhoneDirectory get(String name) {
        System.out.println(name + ": " + map.get(name));
        return this;
    }
}
