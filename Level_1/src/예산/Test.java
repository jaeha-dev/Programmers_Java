package 예산;

import java.util.Arrays;

/**
 * @title  : 핸드폰 번호 가리기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9)); // 3개
        System.out.println(solution(new int[]{2, 2, 3, 3}, 10)); // 4개
    }

    /**
     * 풀이
     * : 배열을 우선 오름차순으로 정렬해야 한다.
     *   (예산 내에서 최대한 많은 부서를 지원해야 하므로 비용이 적은 부서부터 고려해야 한다.)
     * @param d       : 부서별 신청 금액 배열
     * @param budget  : 예산 값
     * @return answer : 결과 값
     */
    private static int solution(int[] d, int budget) {

        // 부서별 신청 금액 배열을 정렬한다.
        Arrays.sort(d);

        // 부서의 개수 및 합계 변수
        int answer = 0;
        int sum = 0;

        for (int value : d) {
            sum += value;

            if (sum > budget) {
                break;
            }

            answer++;
        }

        return answer;
    }
}