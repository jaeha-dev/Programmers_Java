package 체육복;

import java.util.HashMap;
import java.util.Map;

/**
 * @title  : 체육복
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
    }

    /**
     * 풀이
     * @param n       : 학생 인원수
     * @param lost    : 체육복을 도난당한 학생들의 번호
     * @param reserve : 여벌의 체육복을 가져온 학생들의 번호
     * @return answer : 체육 수업을 들을 수 있는 학생 수의 최대 값
     */
    private static int solution(int n, int[] lost, int[] reserve) {
        // 기본 결과값 지정
        int answer = n - lost.length;
        Map<Integer, Integer> map = new HashMap<>();

        // 여벌 체육복을 도난당한 경우


        // 여벌 체육복을 빌려주는 경우

        return answer;
    }
}