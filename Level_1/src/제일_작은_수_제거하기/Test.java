package 제일_작은_수_제거하기;

import java.util.Arrays;

/**
 * @title  : 제일 작은 수 제거하기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
        System.out.println(Arrays.toString(solution(new int[]{})));
        System.out.println(Arrays.toString(solution(new int[]{3, 4, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 6, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 1, 2, 1})));
    }

    /**
     * 풀이
     * @param arr     : 정수 배열
     * @return answer : 결과 배열
     */
    private static int[] solution(int[] arr) {
        int[] answer;

        if (arr.length <= 1) {
            answer = new int[]{-1};

        } else {
            // 최소 값이 제거된 배열이므로 -1 크기
            answer = new int[arr.length - 1];
            int index = 0;
            int min = Integer.MAX_VALUE;

            // 최소 값 찾기
            for (int i : arr) {
                min = Math.min(min, i);
            }

            // 0 -> 1 ? 4 -> answer[0] = 4
            // 1 -> 1 ? 3 -> answer[1] = 3
            // 2 -> 1 ? 2 -> answer[2] = 2
            // X
            // 최소 값을 제외한 새로운 배열
            for (int num : arr) {
                if (min < num) {
                    answer[index++] = num;
                }
            }

//            // 최소 값이 제거된 배열이므로 -1 크기
//            answer = new int[arr.length - 1];
//            int min = Integer.MAX_VALUE;
//
//            // 최소 값 찾기
//            for (int i : arr) {
//                min = Math.min(min, i);
//            }
//
//            // 0 -> 1 ? 4 -> answer[0] = 4
//            // 1 -> 1 ? 3 -> answer[1] = 3
//            // 2 -> 1 ? 2 -> answer[2] = 2
//            // X
//            // 최소 값을 제외한 새로운 배열
//            for (int i = 0; i < answer.length; i++) {
//                if (min < arr[i]) {
//                    answer[i] = arr[i];
//                }
//            }
        }

        return answer;
    }
}