package 프린터;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @title  : 프린터
 * @author : jaeha-dev (Git)
 * @refer  : https://woovictory.github.io/2018/03/19/JavaCollectionPriorityQueue, https://jjjayyy.tistory.com/92
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2)); // 1
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0)); // 5
    }

    /**
     * 풀이
     * @param priorities : 인쇄 대기 목록
     * @param location   : 요청한 인쇄 문서
     * @return answer    : 요청한 인쇄 문서의 순번
     */
    private static int solution(int[] priorities, int location) {
        int answer = 0;

        // new PriorityQueue<>(): 최소 값을 기준으로 우선 순위가 정렬된다.
        // new PriorityQueue<>(Collections.reverseOrder()): 최대 값을 기준으로 우선 순위가 정렬된다.
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        // 큐에 데이터 추가
        for (int priority : priorities) {
            queue.add(priority);
        }

        // [3, 2, 2, 1], [9, 1, 1, 1, 1, 1]
        // System.out.println(queue);

        while (! queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.element() == priorities[i]) {
                    queue.poll();
                    answer++;

                    if (location == i) {
                        queue.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }
}