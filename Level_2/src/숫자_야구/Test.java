package 숫자_야구;

import java.util.Stack;

/**
 * @title  : 숫자 야구
 * @author : jaeha-dev (Git)
 * @refer  : https://lkhlkh23.tistory.com/71, https://geehye.github.io/programmers-brute-force-search-04/#
 */
public class Test {

    private static final int ANSWER_SIZE = 3; // 질문/답변은 세 자리 숫자
    private static final int MIN_NUMBER = 1;  // 1부터
    private static final int MAX_NUMBER = 9;  // 9까지 선택 가능

    public static void main(String[] args) {

        // 숫자 야구는 각자 서로 다른 1 ~ 9까지 3자리 임의의 숫자를 정한 후, 맞히는 게임이다.
        // 숫자와 위치가 모두 맞을 때는 스트라이크
        // 숫자는 맞지만, 위치가 틀렸을 때는 볼
        // 숫자와 위치가 모두 틀렸을 때는 아웃
        // 숫자의 각 자리가 중복되는 경우는 없다. (111 or 112)
        // 0이 오는 경우는 없다. (110)
        int[] arr1 = new int[]{123, 1, 1};
        int[] arr2 = new int[]{356, 1, 0};
        int[] arr3 = new int[]{327, 2, 0};
        int[] arr4 = new int[]{489, 0, 1};
        System.out.println(solution(new int[][]{arr1, arr2, arr3, arr4})); // 2 (324, 328)
    }

    /**
     * 풀이
     * @param baseball : 질문한 세 자리의 수, 스트라이크의 수, 볼의 수를 담은 2차원 배열
     * @return answer  : 가능한 답의 개수
     */
    private static int solution(int[][] baseball) {
        // 모든 경우의 수가 담긴 스택을 정의한다.
        Stack<String> stack = new Stack<>();
        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            for (int j = MIN_NUMBER; j <= MAX_NUMBER; j++) {
                for (int k = MIN_NUMBER; k <= MAX_NUMBER; k++) {
                    if (i != j && j != k && i != k) {
                        // 서로 다른 숫자인 경우만 저장한다.
                        stack.add(String.valueOf(i * 100 + j * 10 + k));
                    }
                }
            }
        }

        // 스택에서 하나씩 꺼내어 확인한다. (스트라이크 3, 볼 3일 경우, 정답이다.)
        Stack<String> right = new Stack<>();
        boolean flag = true;
        while (! stack.isEmpty()) {
            String numbers = stack.pop();

            for (int i = 0; i < baseball.length && flag; i++) {
                String question = String.valueOf(baseball[i][0]);
                int strikeCount = strike(numbers, question);

                // 정답이 123 일 때, 132는 스트라이크(1), 볼(3)이 아니라 스트라이크(1) 볼(2)이므로 ballCount - strikeCount
                // 또한, 123일 때도 스트라이크(3), 볼(3)이 아니라 스트라이크(3) 볼(0)이다.
                int ballCount = ball(numbers, question) - strikeCount;

                if (strikeCount != baseball[i][1] || ballCount != baseball[i][2]) {
                    flag = false;
                }
            }
            if (flag) right.add(numbers);

            flag = true;
        }

        // System.out.println(right);
        return right.size();
    }

    /**
     * 스트라이크
     * : chatAt() 메소드를 사용하여 일치하는 경우가 스트라이크이다.
     * @param numbers  : 세 자리의 수 (1개의 케이스)
     * @param question : 세 자리의 수 (질문)
     * @return count   : 일치하는 수의 개수 (0은 일치하는 수가 없을 경우)
     */
    private static int strike(String numbers, String question) {
        int count = 0;

        for (int i = 0; i < ANSWER_SIZE; i++) {
            // 각 자리의 숫자가 정확히 일치하는 경우, count++
            if (numbers.charAt(i) == question.charAt(i)) count++;
        }

        return count;
    }

    /**
     * 볼
     * : contains() 메소드를 사용하여 포함되는 경우가 볼이다.
     * @param numbers  : 세 자리의 수 (1개의 케이스)
     * @param question : 세 자리의 수 (질문)
     * @return count   : 일치하는 수의 개수 (0은 일치하는 수가 없을 경우)
     */
    private static int ball(String numbers, String question) {
        int count = 0;

        for (int i = 0; i < ANSWER_SIZE; i++) {
            String number = String.valueOf(numbers.charAt(i));

            // 질문한 숫자가 정답에 포함되는 경우, count++
            if (question.contains(number)) count++;
        }

        return count;
    }
}