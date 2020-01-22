package 행렬의_덧셈;

import java.util.Arrays;

/**
 * @title  : 행렬의 덧셈
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {

        // [2][2]
        // arr1[0] -> [1, 2]
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));

        // [2][1]
        // arr1[0] -> [1]
        System.out.println(Arrays.deepToString(solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }

    /**
     * 풀이
     * : 두 배열의 행, 열의 길이는 동일하다.
     * @param arr1    : 행렬 1
     * @param arr2    : 행렬 2
     * @return answer : 결과 값
     */
    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) { // 행 (row)
            for (int j = 0; j < arr1[0].length; j++) { // 열 (column)
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}