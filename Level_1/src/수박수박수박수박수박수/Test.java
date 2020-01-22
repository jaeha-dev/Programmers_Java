package 수박수박수박수박수박수;

/**
 * @title  : 수박수박수박수박수박수
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    /**
     * 풀이
     * @param n       : 문자열 길이
     * @return answer : 입력 거리
     */
    private static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer.append("수");
            } else if (i % 2 == 0) {
                answer.append("박");
            }
        }

        return answer.toString();
    }
}