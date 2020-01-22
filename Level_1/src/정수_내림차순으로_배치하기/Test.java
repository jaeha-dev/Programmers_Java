package 정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

/**
 * @title  : 정수 내림차순으로 배치하기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    /**
     * 풀이
     * @param n : 정렬 전, 정수
     * @return  : 정렬 후, 정수
     */
    private static long solution(long n) {
        String[] nArr = String.valueOf(n).split("");

        // 오름차순 정렬: Arrays.sort(arr)
        // 내림차순 정렬: Arrays.sort(arr, Collections.reverseOrder())
        Arrays.sort(nArr, Collections.reverseOrder());

        return Long.parseLong(String.join("", nArr));
    }
}