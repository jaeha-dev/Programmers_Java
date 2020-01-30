package 이상한_문자_만들기;

import java.util.StringTokenizer;

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
        System.out.println(solution("A"));
        System.out.println(solution(" AAAAAAAAAAA A A A A AAAAA AAA"));
        System.out.println(solution("try  hello   world"));
    }

    /**
     * 풀이
     * : 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열로 치환한다.
     * @param s       : 입력 문자열
     * @return answer : 결과 문자열
     */
    private static String solution(String s) {
        String[] sArr = s.split(" ", -1);
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

    /**
     * 풀이 ("hello  "와 같이 공백이 n개일 때, 공백을 보존해야 하므로 토크나이저는 사용하지 않음.)
     * : 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열로 치환한다.
     * @param s       : 입력 문자열
     * @return answer : 결과 문자열
     */
//    private static String solution(String s) {
//        StringTokenizer tokenizer = new StringTokenizer(s, " ");
//        StringBuilder builder = new StringBuilder();
//
//        while (tokenizer.hasMoreTokens()) {
//            String word = tokenizer.nextToken();
//            char[] ch = word.toCharArray();
//
//            for (int i = 0; i < ch.length; i++) {
//                if (i % 2 == 0) {
//                    builder.append(Character.toUpperCase(ch[i]));
//                } else {
//                    builder.append(Character.toLowerCase(ch[i]));
//                }
//            }
//
//            builder.append(" ");
//        }
//
//        return builder.toString().trim();
//    }
}