package 문자열_다루기_기본;

/**
 * @title  : 문자열 다루기 기본
 * @author : jaeha-dev (Git)
 */
public class Test_2 {

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

        answer = (s.length() == 4 || s.length() == 6) && checkNumber(s);

        return answer;
    }

    /**
     * 문자열을 정수형으로 형변환 할 때, 예외가 발생하면 숫자 문자열이 아님.
     * @param s : 입력 문자열
     * @return  : 결과 값
     */
    private static boolean checkNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}