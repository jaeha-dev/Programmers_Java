package 예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        int sum = 0;

        for (int value : d) {
            sum += value;

            if (sum > budget) {
                break;
            }

            answer++;
        }

        return answer;
    }
}