package 짝수와_홀수;

/**
 * @title  : 짝수와 홀수
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    /**
     * 풀이
     * @param num     : 입력 정수
     * @return answer : 짝수/홀수 판별 결과
     */
    private static String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;

        // return (num % 2 == 0) ? "Even" : "Odd";
    }
}