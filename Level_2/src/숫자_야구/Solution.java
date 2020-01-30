package 숫자_야구;

import java.util.Stack;

class Solution {
    private static final int ANSWER_SIZE = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    public int solution(int[][] baseball) {
        Stack<String> stack = new Stack<>();
        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            for (int j = MIN_NUMBER; j <= MAX_NUMBER; j++) {
                for (int k = MIN_NUMBER; k <= MAX_NUMBER; k++) {
                    if (i != j && j != k && i != k) {
                        stack.add(String.valueOf(i * 100 + j * 10 + k));
                    }
                }
            }
        }
        Stack<String> right = new Stack<>();
        boolean flag = true;
        while (! stack.isEmpty()) {
            String numbers = stack.pop();

            for (int i = 0; i < baseball.length && flag; i++) {
                String question = String.valueOf(baseball[i][0]);
                int strikeCount = strike(numbers, question);
                int ballCount = ball(numbers, question) - strikeCount;

                if (strikeCount != baseball[i][1] || ballCount != baseball[i][2]) {
                    flag = false;
                }
            }
            if (flag) right.add(numbers);

            flag = true;
        }

        return right.size();
    }

    public static int strike(String numbers, String question) {
        int count = 0;

        for (int i = 0; i < ANSWER_SIZE; i++) {
            if (numbers.charAt(i) == question.charAt(i)) count++;
        }

        return count;
    }

    public static int ball(String numbers, String question) {
        int count = 0;

        for (int i = 0; i < ANSWER_SIZE; i++) {
            String number = String.valueOf(numbers.charAt(i));
            if (question.contains(number)) count++;
        }

        return count;
    }
}