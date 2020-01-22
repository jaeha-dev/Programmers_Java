package 하샤드_수;

/**
 * @title  : 하샤드 수
 * @author : jaeha-dev (Git)
 * @refer  : https://aristatait.tistory.com/54
 */
public class Test {

    public static void main(String[] args) {
        // 10의 모든 자릿수의 합은 1. 10은 1로 나누어 떨어지므로 10은 하샤드 수이다.
        System.out.println(solution(10));

        // 12의 모든 자릿수의 합은 3. 12는 3으로 나누어 떨어지므로 12는 하샤드 수이다.
        System.out.println(solution(12));

        // 11의 모든 자릿수의 합은 2. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아니다.
        System.out.println(solution(11));

        // 13의 모든 자릿수의 합은 4. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아니다.
        System.out.println(solution(13));

        System.out.println(solution(5491));
    }

    /**
     * 풀이
     * : 양의 정수 x가 하샤드 수가 되기 위해서는 x의 자릿수의 합으로 x가 나누어져야 한다.
     *   예를 들어 18의 자릿수 합은 1 + 8 = 9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수이다.
     * @param x       : 양의 정수
     * @return answer :
     */
    private static boolean solution(int x) {
        return (x % calDigitSum(x) == 0);
    }

    /**
     * 자릿수 합
     * : 문자열은 각 문자를 정수로 형변환한 후, 합계를 구하나
     *   정수는 10으로 나누어 가면서 자리수를 없애 나가야 한다.
     * @param x    : 양의 정수
     * @return sum : 결과 값
     */
    private static int calDigitSum(int x) {
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            // x -= x % 10; (생략 가능)
            x /= 10;
        }

        return sum;

        // 예시: 5491
        // 1. 10으로 나눈 나머지를 합에 더한다.
        // 5491 % 10 = 1 -> sum += 1
        // 2. 1번의 결과를 원래의 값에서 뺸다. (생략 가능)
        // 5491 - (5491 % 10) = 5490
        // 3. 2번의 결과를 10으로 나누어서 자리수를 줄인다.
        // 5490 / 10 = 549
    }
}