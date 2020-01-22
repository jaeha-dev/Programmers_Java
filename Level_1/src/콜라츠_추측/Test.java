package 콜라츠_추측;

/**
 * @title  : 콜라츠 추측
 * @author : jaeha-dev (Git)
 */
public class Test {

    /**
     * 설명
     * 1-1. 입력된 수가 짝수라면 2로 나눈다.
     * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
     * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복한다.
     *
     * 예를 들어, 입력된 수가 6이라면 6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 ->1 이 되어 총 8번 만에 1이 된다.
     * 위 작업을 몇 번이나 반복해야하는지 반환하는 함수를 완성하라.
     * 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해야 한다.
     */
    public static void main(String[] args) {
        System.out.println(solution(6));

        // 16 -> 8 -> 4 -> 2 -> 1 이되어 총 4번만에 1이 된다.
        System.out.println(solution(16));

        // 626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴한다.
        System.out.println(solution(626331));
    }

    /**
     * 풀이
     * @param num    : 입력 번호
     * @return count : 결과 값
     */
    private static int solution(int num) {
        int count = 0;

        while (num != 1) {
            if (count++ == 500) {
                count = -1;
                break;
            }

            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
            }
        }

        return count;
    }
}