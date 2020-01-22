package 문자열_내림차순으로_배치하기;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        return new StringBuilder(new String(sArr)).reverse().toString();
    }
}