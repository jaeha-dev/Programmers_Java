package 백이십사_나라의_숫자;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n != 0) {
            if (n % 3 == 0) {
                answer.insert(0, "4");
                n = n/3 - 1;
            } else {
                answer.insert(0, n % 3);
                n = n/3;
            }
        }

        return answer.toString();
    }
}