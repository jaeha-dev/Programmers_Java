package 체육복;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : jaeha-dev (Git)
 * @title : 체육복
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
        System.out.println(solution(6, new int[]{3}, new int[]{1}));
    }

    /**
     * 풀이
     * : 여벌의 체육복은 자신의 앞 또는 뒷 번호 학생에게만 빌려줄 수 있다.
     * @param n       : 학생 수
     * @param lost    : 체육복을 도난당한 학생들의 번호
     * @param reserve : 여벌의 체육복을 가져온 학생들의 번호
     * @return answer : 체육 수업을 들을 수 있는 학생 수의 최대 값
     */
    private static int solution(int n, int[] lost, int[] reserve) {

        // 기본 결과값 지정
        int answer = 0;

        // 학생별 체육복 개수를 1개로 초기화한다.
        Map<Integer, Integer> students = new HashMap<>();
        for (int i = 1; i <= n; i++) students.put(i, 1);

        // 도난당한 경우 -1, 여벌이 있는 경우 +1
        // 도난당한 학생은 0개
        // 도난당하지 않았으나 여벌이 없는 학생은 1개
        // 도낭당하지 않았고 여벌이 있는 학생은 2개
        for (int s: lost) students.put(s, students.get(s) - 1);
        for (int s: reserve) students.put(s, students.get(s) + 1);

        // 1번 케이스: 5명, [2, 0, 2, 0, 2]
        // 2번 케이스: 5명, [1, 0, 2, 0, 1]
        // 3번 케이스: 3명, [2, 1, 0]
        for (int i = 1; i <= n; i++) {
            if (students.get(i) == 0) {
                // 0 또는 n + 1 인덱스는 없으므로 주의한다.
                if (students.containsKey(i - 1) && students.get(i - 1) == 2) {
                    // 뒷 번호의 학생이 여벌이 있는 경우
                    students.put(i, 1);
                    students.put(i - 1, students.get(i - 1) - 1);
                }

                if (students.containsKey(i + 1) && students.get(i + 1) == 2) {
                    // 앞 번호의 학생이 여벌이 있는 경우
                    students.put(i, 1);
                    students.put(i + 1, students.get(i + 1) - 1);
                }
            }
        }

        System.out.println(students.values());

        // 체육복이 있는 학생을 모두 출력한다.
        for (int i = 1; i <= n; i++) {
            if (students.get(i) != 0) answer++;
        }

        return answer;
    }
}