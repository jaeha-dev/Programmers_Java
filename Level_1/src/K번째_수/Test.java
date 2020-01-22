package K번째_수;

import java.util.Arrays;

/**
 * @title  : K번째 수
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        int[]   arr1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(arr1, arr2)));
    }

    /**
     * 풀이
     * @param array    : 대상 배열
     * @param commands : 명령 배열
     * @return answer  : 결과 배열
     */
    private static int[] solution(int[] array, int[][] commands) {

        // 결과 배열
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            // copyOfRange(): 배열 복사
            //                원본 배열, 시작 인덱스, 끝 인덱스
            // 문제와 달리 실제 인덱스는 0부터 시작하므로 1을 뺀다.
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArray);
            // System.out.println(Arrays.toString(subArray));

            answer[i] = subArray[commands[i][2] - 1];
        }

        return answer;
    }
}