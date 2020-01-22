package 평균_구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for (int value : arr) {
            answer += value;
        }

        return answer / arr.length;
    }
}