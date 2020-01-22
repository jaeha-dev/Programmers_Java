package 문자열_다루기_기본;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            answer = false;
            return answer;
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.println((int) s.charAt(i));

            if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }

        return answer;
    }
}