package 나누어_떨어지는_숫자_배열;

import java.util.Arrays;

/**
 * @title  : 나누어 떨어지는 숫자 배열
 * @author : jaeha-dev (Git)
 * @refer  : https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 6}, 10)));
    }

    /**
     * 풀이
     * @param arr     : 입력 배열
     * @param divisor : 나눌 정수
     * @return answer : 결과 배열
     */
    private static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(value -> value % divisor == 0).toArray();
        Arrays.sort(answer); // 정렬

        if (answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}