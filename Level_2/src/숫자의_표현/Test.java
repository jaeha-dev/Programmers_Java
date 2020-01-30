package 숫자의_표현;

/**
 * @title  : 숫자의 표현
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        // 1 + 2 + 3 = 6
        // 6 = 6
        System.out.println(solution(6)); // 3이 최대 값이므로 6의 절반까지만 검사하면 된다.
        // 3 + 4 = 7
        // 7 = 7
        System.out.println(solution(7)); // 4이 최대 값이므로 7의 절반 + 0.5까지만 검사하면 된다.
        // 1 + 2 + 3 + 4 + 5 = 15
        // 4 + 5 + 6 = 15
        // 7 + 8 = 15
        // 15 = 15
        System.out.println(solution(15)); // 8이 최대 값이므로 15의 절반 + 0.5까지만 검사하면 된다.
        // 1 + 2 + 3 + 4 + 5 + 6 = 21
        // 6 + 7 + 8 = 21
        // 10 + 11 = 21
        // 21 = 21
        System.out.println(solution(21)); // 11이 최대 값이므로 21의 절반 + 0.5까지만 검사하면 된다.
    }

    /**
     * 풀이
     * : 자연수 n까지 모두 검사할 경우 효율성을 만족하지 못한다.
     *   (n의 절반보다 큰 값을 조합하는 것은 무의미하다.)
     * @param n : 자연수
     * @return  : 자연수 n을 연속한 자연수의 합으로 표현하는 방법의 개수
     */
    private static int solution(int n) {

        int answer = 1; // 자연수 n 자신으로 표현할 수 있으므로 기본 값은 1이다.
        int range = n / 2 + 1; // 검사 범위: 위의 예시는 +0 ~ +0.5이나, 정수형이므로 +1의 범위까지 검사한다.
        int sum = 0; // 연속된 자연수의 합

        for (int i = 1; i < range; i++) {
            sum = i;

            for (int j = i + 1; (j <= range) && (sum < n); j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

    // 자연수 n이 15일 때,
    // 1. i = 1, j = 2 -> sum = 3
    //           j = 3 -> sum = 6
    //           j = 4 -> sum = 10
    //           j = 5 -> sum = 15
    //           sum(15) == n(15)이므로 answer = 2; break;
    // 2. i = 2, j = 3 -> sum = 5
    //           j = 4 -> sum = 9
    //           j = 5 -> sum = 14
    //           j = 6 -> sum = 20
    //           sum(20) < n(15)를 만족하지 못하므로 break;
    // 3. i = 3, j = 4 -> sum = 7
    //           j = 5 -> sum = 12
    //           j = 6 -> sum = 18
    //           sum(18) < n(15)를 만족하지 못하므로 break;
    // 4. i = 4, j = 5 -> sum = 9
    //           j = 6 -> sum = 15
    //           sum(15) == n(15)이므로 answer = 3; break;
    // 5. i = 5
    //    range(4)를 초과하므로 break;
}