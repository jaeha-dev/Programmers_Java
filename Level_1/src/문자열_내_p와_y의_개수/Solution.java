package 문자열_내_p와_y의_개수;

class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        String[] strings = s.split("");

        for (String token : strings) {
            if (token.equalsIgnoreCase("P")) {
                pCount++;
            } else if (token.equalsIgnoreCase("Y")) {
                yCount++;
            }
        }

        return (pCount == yCount);
    }
}