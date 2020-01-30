package 최댓값과_최솟값;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            for (String token : s.split(" ")) {
                add(Integer.parseInt(token));
            }
        }};

        return Collections.min(list) + " " + Collections.max(list);
    }
}