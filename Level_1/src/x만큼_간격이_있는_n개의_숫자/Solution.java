package x만큼_간격이_있는_n개의_숫자;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long add = 0;

        for (int i = 0; i < n; i++) {
            answer[i] = (add += x);
        }

        return answer;
    }
}