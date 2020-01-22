package 카카오_실패율;

import java.util.Arrays;

/**
 * @title  : 2019 카카오 - 실패율
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {

        // 5개의 스테이지
        // 8명의 사용자

        // 1번 스테이지는 8명이 도전, 1명이 통과하지 못함 -> 실패율: 1/8 = 0.125
        // 2번 스테이지는 7명이 도전, 3명이 통과하지 못함 -> 실패율: 3/7 = 0.42
        // 3번 스테이지는 4명이 도전, 2명이 통과하지 못함 -> 실패율: 2/4 = 1/2 = 0.5
        // 4번 스테이지는 2명이 도전, 1명이 통과하지 못함 -> 실패율: 1/2 = 0.5
        // 5번 스테이지는 1명이 도전, 0명이 통과하지 못함 -> 실패율: 0/1 = 0
        // 6번 스테이지는 5번 스테이지까지 통과한 사용자를 나타내므로 제외
        // 추가로 스테이지에 도달한 사용자가 없을 경우 해당 스테이지의 실패율은 0

       // 실패율이 높은 스테이지 -> 3, 4, 2, 1, 5
       System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));

       System.out.println(Arrays.toString(solution(4, new int[]{4, 4, 4, 4, 4})));
    }

    /**
     * 풀이
     * @param N       : 스테이지 개수
     * @param stages  : 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
     * @return answer : 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열
     */
    private static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];



        return answer;
    }

    /**
     * Fail 클래스
     * 스테이지 번호, 스테이지 실패율
     */
    static class Fail {
        int stageNum;
        double failRate;

        public Fail(int stageNum, double failRate) {
            this.stageNum = stageNum;
            this.failRate = failRate;
        }
    }
}