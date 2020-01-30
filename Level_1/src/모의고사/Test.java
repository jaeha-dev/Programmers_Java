package 모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title  : 모의고사
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    /**
     * 풀이
     * @param answers : 정답 배열
     * @return answer : 문제를 가장 많이 맞춘 수포자 배열 (n명일 경우 오름차순 정렬)
     */
    private static int[] solution(int[] answers) {
        // 수포자들의 정답 찍기 패턴
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 3명의 정답 개수
        int[] scores = new int[3];

        // else if 문을 사용할 경우, 카운팅이 안될 수 있음.
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) {
                // i = 0 -> 0 % 5 = 0-> arr1[0]
                // answers[0] == arr1[0] 이므로 정답
                // i = 1 -> 1 % 5 = 1 -> arr1[1]
                // answers[1] == arr1[1] 이므로 정답
                // i = 2 -> 2 % 5 = 2-> arr1[2]
                // answers[2] == arr1[2] 이므로 정답
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

    /**
     * 최고 점수 판별
     * @param scores     : 수포자들의 정답 개수 배열
     * @return resultArr : 최고 점수를 받은 수포자 배열
     */
    private static int[] getResult(int[] scores) {
        // 최고 점수
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 결과 배열
        List<Integer> resultList = new ArrayList<>();

        // 첫 번째 수포자부터 저장하므로 정렬이 불필요하다.
        if (maxScore == scores[0]) resultList.add(1);
        if (maxScore == scores[1]) resultList.add(2);
        if (maxScore == scores[2]) resultList.add(3);

        // 스트림을 사용하였을 때 반복문보다 효율성이 낮았다. (Result.txt 참고)
        // return resultList.stream().mapToInt(i -> i).toArray();

        int[] resultArr = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }
        return resultArr;
    }
}