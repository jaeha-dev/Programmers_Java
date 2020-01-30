package 더_맵게;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) queue.add(i);

        int count = 0;

        while (true) {
            if (queue.peek() >= K) break;
            if (queue.size() == 1) return -1;
            queue.add(queue.poll() + (queue.poll() * 2));
            count++;
        }

        return count;
    }
}