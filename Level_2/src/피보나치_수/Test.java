package 피보나치_수;

/**
 * @title  : 피보나치 수
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(3)); // 2
        System.out.println(solution(5)); // 5
    }

    /**
     * 풀이
     * @param n : 자연수 n
     * @return  : n번째 피보나치 / 1234567
     */
    private static int solution(int n) {
        return getFibonacci(n);
    }

    /**
     * 피보나치
     */
    private static int getFibonacci(int n) {
        int f0 = 0, f1 = 1, fi = 0;

        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            for (int i = 2; i <= n; i++) {
                fi = (f0 + f1) % 1234567;
                f0 = f1 % 1234567;
                f1 = fi % 1234567;
            }
        }

        return fi;
    }

    /**
     * 피보나치 반복
     */
//    private static int getFibonacciLoop(int n) {
//        // F(0) = 0, F(1) = 1, F(i)
//        int f0 = 0, f1 = 1, fi = 0;
//
//        if (n == 0) return 0;
//        else if (n == 1) return 1;
//        else {
//            for (int i = 2; i <= n; i++) {
//                fi = f0 + f1;
//                f0 = f1;
//                f1 = fi;
//            }
//        }
//
//        return fi;
//    }

    /**
     * 피보나치 재귀
     * : F(0) = 0
     *   F(1) = 1
     *   F(2) = F(0) + F(1) = 0 + 1 = 1
     *   F(3) = F(1) + F(2) = 1 + 1 = 2
     *   F(4) = F(2) + F(3) = 1 + 2 = 3
     *   F(5) = F(3) + F(4) = 2 + 3 = 5
     *   ...
     */
//    private static int getFibonacciRecur(int n) {
//        if (n == 0) return 0;
//        else if (n == 1) return 1;
//        else return getFibonacciRecur(n - 1) + getFibonacciRecur(n - 2);
//    }
}