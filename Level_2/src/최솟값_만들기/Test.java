package 최솟값_만들기;

import java.util.Arrays;

/**
 * @title  : 최솟값 만들기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {

        // A에서 첫번째 숫자인 1, B에서 두번째 숫자인 5를 뽑아 곱하여 더한다. (누적된 값 : 0 + 5(1x5) = 5)
        // A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더한다. (누적된 값 : 5 + 16(4x4) = 21)
        // A에서 세번째 숫자인 2, B에서 첫번째 숫자인 4를 뽑아 곱하여 더한다. (누적된 값 : 21 + 8(2x4) = 29)
        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4})); // 29

        // A에서 첫번째 숫자인 1, B에서 두번째 숫자인 4를 뽑아 곱하여 더한다. (누적된 값 : 0 + 4(1x4) = 4)
        // A에서 두번째 숫자인 2, B에서 첫번째 숫자인 3을 뽑아 곱하여 더한다. (누적된 값 : 4 + 6(2x3) = 10)
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4})); // 10
    }

    /**
     * 풀이
     * : 선택은 배열의 길이만큼 한다.
     * @param A : 배열 A
     * @param B ; 배열 B
     * @return  : 누적 값 중, 최소 값
     */
    private static int solution(int[] A, int[] B) {
        // A, B를 정렬한다.
        // 각 배열에서 가장 작은 값과 가장 큰 값을 곱하는 것이 누적 값 중, 최소 값이다.
        Arrays.sort(A); Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            // A는 정순, B는 역순으로 순환한다.
            sum += (A[i] * B[A.length - 1 - i]);
        }

        return sum;
    }
}