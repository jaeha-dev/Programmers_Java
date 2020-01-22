package 나누어_떨어지는_숫자_배열;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(value -> value % divisor == 0).toArray();
        Arrays.sort(answer); // 정렬

        if (answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}