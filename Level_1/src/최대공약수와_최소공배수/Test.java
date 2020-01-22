package 최대공약수와_최소공배수;

import java.util.Arrays;

/**
 * @title  : 최대공약수와 최소공배수
 * @author : jaeha-dev (Git)
 * @refer  : http://lonpeach.com/2017/11/12/Euclidean-algorithm
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(1071, 1029)));
    }

    /**
     * 풀이 (유클리드 호제법)
     * : 호제법이란 말은 두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘을 나타낸다.
     * @param n       : 첫 번째 수
     * @param m       : 두 번째 수
     * @return answer : 결과 배열
     */
    private static int[] solution(int n, int m) {
        // [최대공약수, 최소공배수]
        int[] answer = new int[2];

        answer[0] = getGcd(n, m);
        answer[1] = getLcm(n, m);

        return answer;
    }

    /**
     * 최대공약수
     * @param n : 정수
     * @param m : 정수
     * @return  : 결과
     */
    private static int getGcd(int n, int m) {
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return n;

        // 예시: 1071, 1029
        // 1071은 1029로 나누어 떨어지지 않으므로 1071을 1029로 나눈 나머지 -> 42
        // 1029는 42로 나누어 떨어지지 않으므로 1029를 42로 나눈 나머지 -> 21
        // 42는 21로 나누어 떨어지므로 최대공약수는 21
    }

    /**
     * 최소공배수
     * : 두 정수가 공통적으로 가지는 배수 중 가장 작은 값을 의미한다.
     * @param n : 정수
     * @param m : 정수
     * @return  : 결과
     */
    private static int getLcm(int n, int m) {
        // 유클리드 호제법을 사용한다.
        // 최소공배수 = a * b / a, b의 최대공약수
        return n * m / getGcd(n, m);
    }
}