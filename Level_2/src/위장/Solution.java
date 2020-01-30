package 위장;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];

            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);

            } else {
                map.put(key, 1);
            }
        }

        return count(map);
    }

    public static int count(Map<String, Integer> map) {
        int count = 1;

        for (int value : map.values()) {
            count *= (value + 1);
        }

        return count - 1;
    }
}