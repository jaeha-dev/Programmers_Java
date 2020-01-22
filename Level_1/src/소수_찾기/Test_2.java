package 소수_찾기;

/**
 * @title  : 소수 판별
 * @author : jaeha-dev (Git)
 * @refer  : https://jongmin92.github.io/2017/11/05/Algorithm/Concept/prime
 */
public class Test_2 {

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
        System.out.println(solution(12));
        System.out.println(solution(17));
    }

    /**
     * 풀이
     * @param n        : 대상 숫자
     * @return isPrime : 소수 여부
     */
    private static boolean solution(int n) {
        boolean isPrime = true;

        // 1은 소수가 아니므로 2부터 시작한다.
        // 2부터 n의 제곱근까지의 수로 나누었을 때, 나누어지는 수가 있을 경우 반복문 종료
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        // n = 10
        // i = 2 -> 10 % 2 = 0 -> 소수X

        // n = 5
        // i = 2 -> 5 % 2 = 1 -> 소수O
        // i = 3 -> 5 % 3 = 2 -> 소수O

        // n = 12
        // i = 2 -> 12 % 2 = 0 -> 소수X
        // i = 3 -> 12 % 3 = 0 -> 소수X

        // n = 17
        // i = 2 -> 17 % 2 = 1 -> 소수O
        // i = 3 -> 17 % 3 = 2 -> 소수O
        // i = 4 -> 17 % 4 = 1 -> 소수O

        return isPrime;
    }
}