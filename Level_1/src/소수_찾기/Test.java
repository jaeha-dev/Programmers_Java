package 소수_찾기;

/**
 * @title  : 소수 찾기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
        System.out.println(solution(12));
        System.out.println(solution(17));
    }

    /**
     * 풀이
     * @param n      : 대상 숫자
     * @return count : 소수 개수
     */
    private static int solution(int n) {
        int count = 0;
        boolean isPrime;

        // 1은 소수가 아니므로 2부터 시작한다.
        for (int i = 2; i <= n; i++) {
            isPrime = true;

            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                // System.out.println(i);
                count++;
            }
        }

        // n = 10
        // j = 2 ->

        return count;
    }
}