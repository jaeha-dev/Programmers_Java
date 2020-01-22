package 약수의_합;

/**
 * @title  : 약수의 합
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(5));
    }

    /**
     * 풀이
     * @param n    : 입력 값
     * @return sum : 약수의 합
     */
    private static int solution(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}