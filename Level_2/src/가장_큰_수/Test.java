package 가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @title  : 가장 큰 수
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
        System.out.println(solution(new int[]{30, 303}));
        System.out.println(solution(new int[]{0, 0, 0, 0}));
    }

    /**
     * 풀이
     * @param numbers : 주어진 수
     * @return answer : 가장 큰 수
     */
    private static String solution(int[] numbers) {
        StringBuilder builder = new StringBuilder();
        String strNumbers[] = new String[numbers.length];

        // 정수 배열의 요소를 문자열 배열로 이동
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // System.out.println(Arrays.toString(strNumbers));

        // 문자열 배열을 내림차순으로 정렬
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 내림차순 : return (o2 + o1).compareTo(o1 + o2);
                // 오름차순 : return (o1 + o2).compareTo(o1 + o2);
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // System.out.println(Arrays.toString(strNumbers));

        if (strNumbers[0].equals("0")) return "0";

        for (String strNumber : strNumbers) {
            builder.append(strNumber);
        }

        return builder.toString();
    }
}