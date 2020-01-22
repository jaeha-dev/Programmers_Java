package 문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @title  : 문자열 내 마음대로 정렬하기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {

        // "u", "e", "a" -> 정렬 시, [car, bed, sun]
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));

        // "c", "c", "x" -> 정렬 시, [abcd, abce, cdx]
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    /**
     * 풀이
     * @param strings : 문자열 배열
     * @param n       : 정렬 기준이 될 각 문자열의 인덱스
     * @return answer : 졍렬된 문자열 배열
    */
    private static String[] solution(String[] strings, int n) {

        // 문자 비교는 아스키 코드
        Arrays.sort(strings, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                System.out.println((o1.charAt(n) + "(" + (int) o1.charAt(n) + ") : " + o2.charAt(n) + "(" + (int) o2.charAt(n) + ")"));

                if (o1.charAt(n) > o2.charAt(n)) {
                    System.out.println("1: " + Arrays.toString(strings));
                    return 1; // A > B

                } else if (o1.charAt(n) == o2.charAt(n)) {
                    System.out.println("2: " + Arrays.toString(strings));
                    return o1.compareTo(o2);
                    // return 0; // A == B

                } else if (o1.charAt(n) < o2.charAt(n)) {
                    System.out.println("3: " + Arrays.toString(strings));
                    return -1; // A < B

                } else {
                    System.out.println("4: " + Arrays.toString(strings));
                    return 0;
                }
            }
        });

        return strings;
    }
}