package 정수_제곱근_판별;

/**
 * @title  : 정수 제곱근 판별
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    /**
     * 풀이
     * @param n : 판별할 정수
     * @return  : 판별 결과
     */
    private static long solution(long n) {
        double d = Math.sqrt(n);

        if (n == Math.pow((int) d, 2)) {
            // 정수형으로 형변환한 d의 2제곱이 n과 같을 경우
            return (long) Math.pow(d + 1, 2);
        }

        return -1;
    }
}