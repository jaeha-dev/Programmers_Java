package 소수_찾기;

import java.util.HashSet;
import java.util.Set;

/**
 * @title  : 소수 찾기
 * @author : jaeha-dev (Git)
 * @refer  : https://charciavisual.tistory.com/39, https://lkhlkh23.tistory.com/101,
 *           https://onsil-thegreenhouse.github.io/programming/algorithm/2018/04/05/permutation_combination/
 */
public class Test {

    // 17의 경우 1, 7, 17, 71를 모두 뽑아야 하므로 조합이 아닌 순열을 사용해야 한다.
    // (조합은 [1, 7]과 [7, 1]을 중복으로 취급하여 제외한다.)
    public static void main(String[] args) {
        System.out.println(solution("0")); // 0
        System.out.println(solution("7")); // 1
        System.out.println(solution("17")); // 3
        System.out.println(solution("011")); // 2
    }

    /**
     * 풀이
     * @param numbers : 숫자 문자열
     * @return answer : 해당 문자열로 만들 수 있는 소수의 개수
     */
    private static int solution(String numbers) {
        Set<Integer> set = new HashSet<>();

        return set.size();
    }

    /**
     * 숫자 조합 생성
     * : 순열 알고리즘을 사용한다.
     *   (arr: r개를 뽑기 위한 n개의 값, output: 뽑힌 r개의 값, visited: 중복해서 뽑지 않기 위해 체크하는 값)
     * : https://bcp0109.tistory.com/14
     */
    private static int permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        return 0;
    }

    /**
     * 소수 판별
     */
    private static boolean isPrime(int number) {
        int end = (int) Math.sqrt(number);

        for (int i = 2; i <= end; i++) {
            if (end % i == 0) {
                return true;
            }
        }

        return false;
    }
}