package 카카오_다트_게임;

/**
 * @title  : 카카오 다트 게임
 * @author : jaeha-dev (Git)
 * @refer  : https://javaplant.tistory.com/4, https://readystory.tistory.com/63
 */
public class Test {

    /**
     * S(Single) -> 1제곱
     * D(Double) -> 2제곱
     * T(Triple) -> 3제곱
     */
    public static void main(String[] args) {
        // System.out.println(solution("1S2D*3T"));  // 37
        // System.out.println(solution("1D2S#10S")); // 9
        System.out.println(solution("1D2S0T"));   // 3
        // System.out.println(solution("1S*2T*3S")); // 23
        // System.out.println(solution("1D#2S*3S")); // 5
        // System.out.println(solution("1T2D3D#"));  // -4
        // System.out.println(solution("1D2S3T*"));  // 59
    }

    /**
     * 풀이
     * @param dartResult : 다트 게임 내역
     * @return           : 전체 합산 점수
     */
    private static int solution(String dartResult) {

        // 각 게임의 점수를 합산한 배열 (3 게임)
        int[] scoreArr = new int[3];

        // 다트 게임 결과를 저장한 배열
        char[] resultArr = dartResult.toCharArray();

        // 커서
        int cursor = -1;


        return scoreArr[0] + scoreArr[1] + scoreArr[2];
    }

    /**
     * 보너스 점수 계산 (S, D, T)
     */
    private static int calBonus(int score, char bonus) {
        int returnVal = score;

        switch (bonus) {
            case 'S':
                returnVal = (int) Math.pow(score, 1);
                break;
            case 'D':
                returnVal = (int) Math.pow(score, 2);
                break;
            case 'T':
                returnVal = (int) Math.pow(score, 3);
                break;
            default:
                break;
        }

        return returnVal;
    }

    /**
     * 옵션 점수 계산 (*, #)
     */
    private static int calOption(int score, char option) {
        int returnVal = score;

        switch (option) {
            case '*':
                returnVal *= 2;
                break;
            case '#':
                returnVal -= score;
                break;
            default:
                break;
        }

        return returnVal;
    }
}