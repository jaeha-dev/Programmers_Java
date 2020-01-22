package 문자열_다루기_기본;

/**
 * @title  : 문자열 다루기 기본
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("a234")); // F
        System.out.println(solution("1234")); // T
        System.out.println(solution("123a")); // F
        System.out.println(solution("12a3")); // F
        System.out.println(solution("1")); // T
        System.out.println(solution("a")); // F
    }

    /**
     * 풀이
     * @param s       : 입력 문자열
     * @return answer : 결과 값
     */
    private static boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            answer = false;
            return answer;
        }

        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }

        return answer;
    }
}