package 완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

/**
 * @title  : 완주하지 못한 선수
 * @author : jaeha-dev (Git)
 */
class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        String answer = "";

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                answer = s;
            }
        }

        // for (String s : participant) {
        //     if (map.get(s) != 0) {
        //         answer = s;
        //     }
        // }

        return answer;
    }
}