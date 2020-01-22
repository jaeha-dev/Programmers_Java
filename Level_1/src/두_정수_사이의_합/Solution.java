package 두_정수_사이의_합;

class Solution {

    public long solution(int a, int b) {
        int sub = Math.abs(a - b);
        long answer = 0;

        if (sub == 0) {
            answer = a;
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }

        return answer;
    }
}