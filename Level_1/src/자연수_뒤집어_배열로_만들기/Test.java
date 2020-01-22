package 자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

/**
 * @title  : 자연수 뒤집어 배열로 만들기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
        System.out.println(Arrays.toString(solution(98240)));
    }

    /**
     * 풀이
     * @param n       : 자연수
     * @return answer : 결과 배열
     */
    private static int[] solution(long n) {
        char[] nArr = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
        int[] answer = new int[nArr.length];

        for (int i = 0; i < nArr.length; i++) {
            answer[i] = nArr[i] - 48; // 아스키 코드이므로 원래 값을 구하기 위해 -48
        }

        return answer;
    }
}