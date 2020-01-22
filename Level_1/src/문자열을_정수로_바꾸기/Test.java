package 문자열을_정수로_바꾸기;

/**
 * @title  : 문자열 내 마음대로 정렬하기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
    }

    /**
     * 풀이
     * @param s       : 입력 문자열
     * @return answer : 변환된 문자열
     */
    private static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }
}