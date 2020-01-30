package 숫자의_표현;

class Solution {
    public int solution(int n) {
        int answer = 1;
        int range = n / 2 + 1;
        int sum = 0;

        for (int i = 1; i < range; i++) {
            sum = i;

            for (int j = i + 1; (j <= range) && (sum < n); j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}