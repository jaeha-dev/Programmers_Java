package 같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @title  : 같은 숫자는 싫어
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 4, 4, 3, 3})));
    }

    /**
     * 풀이
     * @param arr     : 연속 숫자 제거 전, 배열
     * @return answer : 연속 숫자 제거 후, 배열
     */
    private static int[] solution(int[] arr) {

        // 배열에 0이 있을 수 있으므로 -1을 초기 임시 값으로 지정
        int temp = -1;
        List<Integer> answer = new ArrayList<>();

        for (int value : arr) {
            // if (temp == value) {
            //     continue;
            //
            // } else {
            //     answer.add(value);
            // }

            if (temp != value) {
                answer.add(value);
            }

            temp = value;
        }

        return answer.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
    }
}