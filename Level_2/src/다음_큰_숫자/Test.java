package 다음_큰_숫자;

/**
 * @title  : 다음 큰 숫자
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        // 15(1111)의 다음 큰 숫자는 23(10111)
        System.out.println(solution(15)); // 23

        // 78(1001110)의 다음 큰 숫자는 83(1010011)
        System.out.println(solution(78)); // 83
    }

    /**
     * 풀이
     * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수이다.
     * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 개수와 같다.
     * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수이다.
     * @param n : 자연수 n
     * @return  : n의 다음 큰 숫자
     */
    private static int solution(int n) {
        return nextNumber(n);
    }

    /**
     * 다음 큰 숫자 찾기
     */
    private static int nextNumber(int n) {
        // 2진수로 변환했을 때 1의 개수를 카운팅
        int oneBitCount = Integer.bitCount(n);

        // 다음 큰 숫자(nextNumber)
        int nextNumber = n;

        do {
            nextNumber++;
        } while (Integer.bitCount(nextNumber) != oneBitCount);

        return nextNumber;
    }
}