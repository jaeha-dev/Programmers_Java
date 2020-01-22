package 제일_작은_수_제거하기;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;

        if (arr.length <= 1) {
            answer = new int[]{-1};

        } else {
            answer = new int[arr.length - 1];
            int index = 0;
            int min = Integer.MAX_VALUE;

            for (int i : arr) {
                min = Math.min(min, i);
            }

            for (int num : arr) {
                if (min < num) {
                    answer[index++] = num;
                }
            }
        }

        return answer;
    }
}