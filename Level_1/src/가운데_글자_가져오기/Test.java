package 가운데_글자_가져오기;

/**
 * @title  : 가운데 글자 가져오기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("jk"));
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    /**
     * 풀이
     * @param s       : 입력 문자열
     * @return answer : 가운데 문자열
     */
    private static String solution(String s) {
        String answer = "";
        int length = s.length();

        if (length % 2 == 0) {
            // 4글자일 경우, 4/2 - 1, 4/2 + 1 = 1, 3 (1, 2번째 인덱스)
            // 6글자일 경우, 6/2 - 1, 6/2 + 1 = 2, 4 (2, 3번째 인덱스)
            answer = s.substring(length / 2 - 1, length / 2 + 1);

        } else {
            // 3글자일 경우, 3/2 = (int) 1.5 -> 1번째 인덱스
            // 5글자일 경우, 5/2 = (int) 2.5 -> 2번째 인덱스
            answer = Character.toString(s.charAt(length / 2));
        }

        return answer;
    }
}