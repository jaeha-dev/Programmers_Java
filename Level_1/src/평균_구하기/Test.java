package 평균_구하기;

/**
 * @title  : 평균 구하기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{5, 5}));
    }

    /**
     * 풀이
     * @param arr     : 입력 정수 배열
     * @return answer : 결과 값
     */
    private static double solution(int[] arr) {
        double answer = 0;

        for (int value : arr) {
            answer += value;
        }

        return answer / arr.length;
    }
}