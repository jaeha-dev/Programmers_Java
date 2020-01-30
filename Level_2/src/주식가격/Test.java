package 주식가격;

import java.util.Arrays;

/**
 * @title  : 주식가격
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3}))); // 4, 3, 1, 1, 0
    }

    /**
     * 풀이
     * : 하나의 주식 가격에 대한 배열이다. 1초 시점의 1원은 끝까지 1원 미만으로 떨어지지 않는다.
     * @param prices  : 초 단위로 기록된 주식 가격이 담긴 배열
     * @return answer : 주식 가격이 떨어지지 않은 기간
     */
    private static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0; // 시간

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];


        }

        return answer;
    }
}