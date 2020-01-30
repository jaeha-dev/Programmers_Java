package 최댓값과_최솟값;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @title  : 최댓값과 최솟값
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4")); // 1 4
        System.out.println(solution("-1 -2 -3 -4")); // -4 -1
        System.out.println(solution("-1 -1")); // -1 -1
    }

    /**
     * 풀이
     * @param s : 정수 문자열
     * @return  : 최솟값 최댓값
     */
    private static String solution(String s) {
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            for (String token : s.split(" ")) {
                add(Integer.parseInt(token));
            }
        }};

        return Collections.min(list) + " " + Collections.max(list);
    }
}