package 정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] nArr = String.valueOf(n).split("");

        Arrays.sort(nArr, Collections.reverseOrder());

        return Long.parseLong(String.join("", nArr));
    }
}