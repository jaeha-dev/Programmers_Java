package 핸드폰_번호_가리기;

/**
 * @title  : 핸드폰 번호 가리기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    /**
     * 풀이
     * @param phone_number : 입력 번호
     * @return answer      : 결과 문자열
     */
    private static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int length = phone_number.length();

        for (int i = 0; i < length - 4; i++) {
            answer.append("*");
        }

        answer.append(phone_number, length - 4, length);

        return answer.toString();
    }
}