package H_Index;

import java.util.Arrays;

/**
 * @title  : H-Index
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5})); // 3
        System.out.println(solution(new int[]{0})); // 0
        System.out.println(solution(new int[]{0, 0})); // 0
        System.out.println(solution(new int[]{2, 0})); // 1
        System.out.println(solution(new int[]{22, 42})); // 2
        System.out.println(solution(new int[]{20, 19, 18, 1})); // 3
    }

    /**
     * 풀이
     * : h번 이상 인용된 h개의 논문이 있을 때의 h를 반환한다.
     *   3번 이상 인용된 논문이 4개 있다면 3을 반환하고,
     *   4번 이상 인용된 논문이 3개 있다면 3을 반환한다.
     *   -> h번 이상 인용된 논문이 h개 이상 존재할 h의 최대 값을 구하는 것.
     * @param citations : 발표한 논문의 인용된 횟수
     * @return hIndex   : H-Index
     */
    private static int solution(int[] citations) {
        int hIndex = 0;

        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                hIndex = h;
                break;
            }
        }

        return hIndex;
    }

    // [5, 10]일 때,
    // 5회 이상 인용 논문 수  = 2개 -> h = min(5, 2)  -> 2 -> h-index는 h의 최대 값
    // 10회 이상 인용 논문 수 = 1개 -> h = min(10, 1) -> 1

    // [0, 1, 3, 5, 6] 일 때,
    // 0회 이상 인용 논문 수 = 5개 -> h = min(0, 5) -> 0
    // 1회 이상 인용 논문 수 = 4개 -> h = min(1, 4) -> 1
    // 3회 이상 인용 논문 수 = 3개 -> h = min(3, 3) -> 3 -> h-index는 h의 최대 값
    // 5회 이상 인용 논문 수 = 2개 -> h = min(5, 2) -> 2
    // 6회 이상 인용 논문 수 = 1개 -> h = min(6, 1) -> 1
}