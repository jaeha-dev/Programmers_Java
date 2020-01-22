package 자릿수_더하기;

/**
 * @title  : 자릿수 더하기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }

    /**
     * 풀이
     * @param n       : 자연수
     * @return answer : 자릿수 합
     */
    private static int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}