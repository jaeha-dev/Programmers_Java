package 카카오_캐시;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {

    private static final int HIT_TIME = 1;
    private static final int MISS_TIME = 5;

    public static int solution(int cacheSize, String[] cities) {
        return LRU(cacheSize, cities);
    }

    public static int LRU(int cacheSize, String[] cities) {
        int time = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            if (map.containsKey(city)) {
                time += HIT_TIME;
                map.replace(city, i);

            } else {
                if (cacheSize > 0) {
                    if (map.size() == cacheSize) {
                        map.remove(Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey());
                    }

                    map.put(city, i);
                }

                time += MISS_TIME;
            }
        }

        return time;
    }
}