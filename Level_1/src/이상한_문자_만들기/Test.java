package 이상한_문자_만들기;

/**
 * @title  : 이상한 문자 만들기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
        System.out.println(solution("hello java world"));
        System.out.println(solution("HeLLo spring World"));
        System.out.println(solution("TRY JAVA WORLD"));
        System.out.println(solution(""));
        System.out.println(solution("   "));
        System.out.println(solution(" aBc ddda"));
    }

    /**
     * 풀이
     * : 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열로 치환한다.
     * @param s       : 입력 문자열
     * @return answer : 결과 문자열
     */
    private static String solution(String s) {
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String value : sArr) {
            char[] cArr = value.toCharArray();

            for (int j = 0; j < cArr.length; j++) {
                if (j % 2 == 0) {
                    sb.append(String.valueOf(cArr[j]).toUpperCase());
                } else {
                    sb.append(String.valueOf(cArr[j]).toLowerCase());
                }
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }
}