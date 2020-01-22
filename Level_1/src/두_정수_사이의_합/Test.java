package 두_정수_사이의_합;

/**
 * @title  : 두 정수 사이의 합
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    /**
     * 풀이
     * @param a       : 첫 번째 정수
     * @param b       : 두 번째 정수
     * @return answer : 두 정수 사이의 합
     */
    private static long solution(int a, int b) {
        int sub = Math.abs(a - b);
        long answer = 0;

        if (sub == 0) {
            answer = a;
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }

        return answer;
    }
}