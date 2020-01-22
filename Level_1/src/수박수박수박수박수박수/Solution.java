package 수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer.append("수");
            } else if (i % 2 == 0) {
                answer.append("박");
            }
        }

        return answer.toString();
    }
}