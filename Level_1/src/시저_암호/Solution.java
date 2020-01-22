package 시저_암호;

public class Solution {
    private static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        int loop = n % 26;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + loop) % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + loop) % 26 + 'A');
            }

            answer.append(c);
        }

        return answer.toString();
    }
}