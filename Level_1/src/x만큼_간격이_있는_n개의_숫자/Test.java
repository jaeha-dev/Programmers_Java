package x만큼_간격이_있는_n개의_숫자;

import java.util.Arrays;

/**
 * @title  : x만큼 간격이 있는 n개의 숫자
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }

    /**
     * 풀이
     * @param x       : 정수
     * @param n       : 자연수
     * @return answer : 결과 배열
     */
    private static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long add = 0;

        for (int i = 0; i < n; i++) {
            // arr[0] = 0 + 2
            // arr[1] = 2 + 2
            // arr[2] = 4 + 2
            // arr[3] = 6 + 2
            // arr[4] = 8 + 2
            answer[i] = (add += x);
        }

        return answer;
    }
}