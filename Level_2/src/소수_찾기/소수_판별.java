package 소수_찾기;

/**
 * @title  : 소수 판별
 * @author : jaeha-dev (Git)
 * @refer  : http://javaking75.blog.me/220289619566, https://charciavisual.tistory.com/39
 */
public class 소수_판별 {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        // 1은 소수가 아니다.
        // 소수는 1과 자기자신으로만 나누어 떨이지는 숫자이다.

        start = System.currentTimeMillis();
        print(2147483647, isPrime1(2147483647));
        end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 + "초"); // 9.931초

        start = System.currentTimeMillis();
        print(2147483647, isPrime2(2147483647));
        end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 + "초"); // 5.066초

        start = System.currentTimeMillis();
        print(2147483647, isPrime3(2147483647));
        end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 + "초"); // 0.001초

        start = System.currentTimeMillis();
        print(2147483647, isPrime4(2147483647));
        end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 + "초"); // 0.0초
    }

    /**
     * 결과 출력
     */
    private static void print(int num, boolean isPrime) {
        if (isPrime) {
            System.out.println(num + " >> 소수 O");
        } else {
            System.out.println(num + " >> 소수 X");
        }
    }

    /**
     * 소수 판별(1)
     */
    private static boolean isPrime1(int num) {
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;

                // 나누어 떨어지면 더이상 소수가 아니므로 break;
                break;
            }
        }

        return isPrime;
    }

    /**
     * 소수 판별(2)
     * : 소수 판별 과정의 반복 횟수를 num/2까지
     */
    private static boolean isPrime2(int num) {
        boolean isPrime = true;

        int end = num / 2;
        for (int i = 2; i <= end; i++) {
            if (num % i == 0) {
                isPrime = false;

                // 나누어 떨어지면 더이상 소수가 아니므로 break;
                break;
            }
        }

        return isPrime;
    }


    /**
     * 소수 판별(3)
     * : 소수 판별 과정의 반복 횟수를 num의 제곱근까지
     *   (2의 제곱근은 약 1.414, 4의 제곱근은 2, 25의 제곱근은 5, ...)
     */
    private static boolean isPrime3(int num) {
        boolean isPrime = true;

        int end = (int) Math.sqrt(num);
        for (int i = 2; i <= end; i++) {
            if (num % i == 0) {
                isPrime = false;

                // 나누어 떨어지면 더이상 소수가 아니므로 break;
                break;
            }
        }

        return isPrime;
    }

    /**
     * 소수 판별(4)
     * : 프로그래밍 대회에서 배우는 알고리즘 문제 해결 전략 책 참고
     */
    private static boolean isPrime4(int num) {
        if (num <= 1) return false;     // 1은 소수가 아니다.
        if (num == 2) return true;      // 2는 반드시 소수이다.
        if (num % 2 == 0) return false; // 2를 제외한 모든 짝수는 소수가 아니다.

        int end = (int) Math.sqrt(num);
        for (int i = 3; i <= end; i += 2) {
            // 3번과 동일하게 제곱근까지,
            // 시작값은 3부터, 5, 7, 9, ...
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}