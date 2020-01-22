package 문자열_내림차순으로_배치하기;

import java.util.Arrays;

/**
 * @title  : 문자열 내림차순으로 배치하기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    /**
     * 풀이
     * @param s       : 정렬 전, 문자열
     * @return answer : 정렬 후, 문자열
     */
    private static String solution(String s) {
        String answer = "";

        // 문자열 배열로 분할, 정렬, 병합
        // String[] sArr = s.split("");
        // Arrays.sort(sArr);
        // Collections.reverse(Arrays.asList(sArr));
        // answer = String.join("", sArr);
        // return answer;

        // 보다 효율적인 방법
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        return new StringBuilder(new String(sArr)).reverse().toString();
    }
}