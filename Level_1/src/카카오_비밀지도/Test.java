package 카카오_비밀지도;

import java.util.Arrays;

/**
 * @title  : 카카오 비밀지도 (케이스 2, 6 실패)
 * @author : jaeha-dev (Git)
 * @refer  : Integer.toString(num, n) -> n진수 변환
 *           Integer.toBinaryString(num) -> 2진수 변환
 */
public class Test {

    public static void main(String[] args) {

        // ["#####","# # #", "### #", "# ##", "#####"]
        System.out.println(Arrays.toString(solution(5,
                new int[]{9, 20, 28, 18, 11},
                new int[]{30, 1, 21, 17, 28}))
        );

        // ["#### ", "    #", "# # #", "#   #", "###  "]
        System.out.println(Arrays.toString(solution(5,
                new int[]{0, 0, 0, 0, 0},
                new int[]{30, 1, 21, 17, 28}))
        );

        // ["######", "### #", "## ##", " #### ", " #####", "### # "]
        System.out.println(Arrays.toString(solution(6,
                new int[]{46, 33, 33 ,22, 31, 50},
                new int[]{27, 56, 19, 14, 14, 10}))
        );
    }

    /**
     * 풀이
     * : 지도는 정사각형 배열이며, 각 칸은 공백(" ") 또는 벽("#")으로 구성된다.
     *   전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있고,
     *   지도 1, 지도 2 중 어느 하나라도 공백 또는 벽이라면 전체 지도에서도 공백 또는 벽이다.
     * @param n    : 한 변의 길이
     * @param arr1 : 정수 배열로 암호화된 지도 1
     * @param arr2 : 정수 배열로 암호화된 지도 2
     * @return map : 해독된 비밀지도의 암호
     */
    private static String[] solution(int n, int[] arr1, int[] arr2) {
        int[] temp = new int[n];
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
            temp[i] = operateOR(arr1[i], arr2[i]);
            map[i] = stringToBinaryString(n, Integer.toBinaryString(temp[i]));
        }

        return map;
    }

    /**
     * OR 연산
     * @param row1 : 10진수 1
     * @param row2 : 10진수 2
     * @return     : OR 연산된 결과 (10진수)
     */
    private static int operateOR(int row1, int row2) {
        return row1 | row2;
    }

    /**
     * 2진수 문자열에서 0과 1을 칸(" ")과 벽("#")으로 치환한다.
     * : 한 변의 길이를 만족하지 못할 경우, 부족한 자릿수만큼 0을 채운다.
     * @param n    : 한 변의 길이
     * @param row  : 지도의 한 열
     * @return row : 변환된 문자열
     */
    private static String stringToBinaryString(int n, String row) {
        if (row.length() < n) {
            row = String.format("%0" + n + "d", Integer.parseInt(row));
        }

        // replace() 또는 replaceAll() 사용
        row = row.replace("0", " ")
                 .replace("1", "#");

        return row;
    }
}