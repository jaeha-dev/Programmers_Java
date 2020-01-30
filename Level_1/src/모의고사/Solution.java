package 모의고사;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) {
                scores[0]++;
            }

            if (answers[i] == arr2[i % arr2.length]) {
                scores[1]++;
            }

            if (answers[i] == arr3[i % arr3.length]) {
                scores[2]++;
            }
        }

        return getResult(scores);
    }

    public int[] getResult(int[] scores) {
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> resultList = new ArrayList<>();

        if (maxScore == scores[0]) resultList.add(1);
        if (maxScore == scores[1]) resultList.add(2);
        if (maxScore == scores[2]) resultList.add(3);

        int[] resultArr = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }
        return resultArr;
    }
}