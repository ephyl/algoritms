package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharactersCounting {
    public static Map<Character, Integer> countCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars
        ) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else map.put(ch, 1);
        }
        return map;
    }
}
