package 카카오_다트_게임;

/**
 * @title  : 카카오 다트 게임
 * @author : jaeha-dev (Git)
 * @refer  : https://javaplant.tistory.com/4, https://readystory.tistory.com/63
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));  // 37
        System.out.println(solution("1D2S#10S")); // 9
        System.out.println(solution("1D2S0T"));   // 3
        System.out.println(solution("1S*2T*3S")); // 23
        System.out.println(solution("1D#2S*3S")); // 5
        System.out.println(solution("1T2D3D#"));  // -4
        System.out.println(solution("1D2S3T*"));  // 59
    }

    /**
     * 풀이
     * @param result : 다트 게임 내역
     * @return       : 전체 합산 점수
     */
    private static int solution(String result) {
        return calScore(result);
    }

    /**
     * 정수 판별
     * @param score     : 점수 문자열
     * @return isNumber : 판별 결과
     */
    private static boolean isNumber(String score) {
        boolean isNumber = false;

        try {
            Integer.parseInt(score);
            isNumber = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return isNumber;
    }

    /**
     * 보너스 및 옵션 점수 계산
     * : 각 게임의 결과는 기본 점수 | 보너스 점수 | 옵션 점수로 구성된다.
     * @param result : 다트 게임 내역
     * @return       : 최종 합산 점수
     */
    private static int calScore(String result) {

        // 배열 인덱스 커서
        int arrCursor = 0;

        // 각 게임별 합산 점수
        int[] scoreArr = new int[3];

        // 임시 점수 문자열 (기본 점수는 0 ~ 10점까지 존재하므로 문자열로 처리하는 것이 더 편리하다.)
        StringBuilder tempScore = new StringBuilder(); // 싱글 스레드이므로 빌더를 사용한다.

        for (char c : result.toCharArray()) {
            if (Character.isDigit(c)) {
                // 현재 문자가 숫자일 경우, 점수 문자열에 추가한다.
                tempScore.append(c);

            } else {
                if (! tempScore.toString().isEmpty() && isNumber(tempScore.toString())) {
                    // 점수 문자열이 비어 있지 않고 숫자일 때, 점수 문자열을 형변환한다.
                    scoreArr[arrCursor++] = Integer.parseInt(tempScore.toString());

                    // 점수 문자열 초기화
                    tempScore.setLength(0);
                }

                switch (c) {
                    case 'S': // Single
                        scoreArr[arrCursor - 1] = (int) Math.pow(scoreArr[arrCursor - 1], 1);
                        break;

                    case 'D': // Double
                        scoreArr[arrCursor - 1] = (int) Math.pow(scoreArr[arrCursor - 1], 2);
                        break;

                    case 'T': // Triple
                        scoreArr[arrCursor - 1] = (int) Math.pow(scoreArr[arrCursor - 1], 3);
                        break;

                    case '*': // 스타상
                        scoreArr[arrCursor - 1] = scoreArr[arrCursor - 1] * 2;
                        if (arrCursor - 2 >= 0) {
                            scoreArr[arrCursor - 2] = scoreArr[arrCursor - 2] * 2;
                        }
                        break;

                    case '#': // 아차상
                        scoreArr[arrCursor - 1] = scoreArr[arrCursor - 1] * -1;
                        break;

                    default:
                        break;
                }
            }
        }

        return scoreArr[0] + scoreArr[1] + scoreArr[2];
    }
}