package 같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public int[] solution(int[] arr) {
        int temp = -1;
        List<Integer> answer = new ArrayList<>();

        for (int value : arr) {
            if (temp == value) {
                continue;

            } else {
                answer.add(value);
            }

            temp = value;
        }

        return answer.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
    }
}