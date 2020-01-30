package 체육복;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Map<Integer, Integer> students = new HashMap<>();
        for (int i = 1; i <= n; i++) students.put(i, 1);

        for (int s: lost) students.put(s, students.get(s) - 1);
        for (int s: reserve) students.put(s, students.get(s) + 1);

        for (int i = 1; i <= n; i++) {
            if (students.get(i) == 0) {
                if (students.containsKey(i - 1) && students.get(i - 1) == 2) {
                    students.put(i, 1);
                    students.put(i - 1, students.get(i - 1) - 1);
                }

                if (students.containsKey(i + 1) && students.get(i + 1) == 2) {
                    students.put(i, 1);
                    students.put(i + 1, students.get(i + 1) - 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (students.get(i) != 0) answer++;
        }

        return answer;
    }
}