package 더_맵게;

import java.util.PriorityQueue;

/**
 * @title  : 더 맵게
 * @author : jaeha-dev (Git)
 * @refer  : https://woovictory.github.io/2018/03/19/JavaCollectionPriorityQueue, https://sup2is.github.io/java-data-structure-4 (우선 순위 큐 개념)
 *           https://n1tjrgns.tistory.com/189 (자바의 우선 순위 큐는 힙으로 구현되어 있다.)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1}, 3)); // -1

        // 2 (16번 TC로 인해 반복문에서 size 검사가 두 번째로 와야 한다.)
        // size 검사를 먼저 할 경우, 큐에 13이 남았을 때 size가 1이므로 -1을 반환시키므로 실패한다.
        System.out.println(solution(new int[]{1, 2, 3}, 11));
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7)); // 2
    }

    /**
     * 풀이
     * : 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
     *   (배열의 요소 중, 최소 값 + (두 번째로 가장 작은 값 * 2)
     * @param scoville : 모든 음식의 스코빌 지수 배열
     * @param K        : 목표 스코빌 지수
     * @return count   : 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수
     */
    private static int solution(int[] scoville, int K) {

        // 낮은 숫자의 우선 순위가 크다. (오름차순)
        // new PriorityQueue<>(Collections.reverseOrder()); -> 높은 숫자의 우선 순위가 크다. (내림차순)
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 배열의 요소를 큐에 저장한다.
        for (int i : scoville) queue.add(i);

        // 최소 횟수를 구한다.
        int count = 0;

        while (true) {
            if (queue.peek() >= K) break;     // 목표 지수(K)보다 클 경우, break;
            if (queue.size() == 1) return -1; // 배열의 크기가 1일 경우, -1; (제한 사항)

            // 최소 값을 꺼낸 후, 그다음 최소 값을 꺼낸다.
            queue.add(queue.poll() + (queue.poll() * 2));
            count++;
        }

        return count;
    }

    // 큐 - 삽입(offer, add)
    //    - 삭제(poll, remove) (큐가 비어 있을 경우, poll()은 null 반환, remove()는 예외 발생)
    //    - 읽기(peek, element) (큐가 비어 있을 경우, peek()은 null 반환, element()는 예외 발생)
}