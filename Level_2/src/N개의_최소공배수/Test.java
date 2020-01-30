package N개의_최소공배수;

/**
 * @title  : N개의 최소공배수
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14})); // 168
        System.out.println(solution(new int[]{1, 2, 3})); // 6
    }

    /**
     * 풀이
     * @param arr     :  n개의 숫자를 담은 배열
     * @return result : 숫자들의 최소공배수
     */
    private static int solution(int[] arr) {
        int lcm = arr[0] * arr[1] / getGcd(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            lcm = lcm * arr[i] / getGcd(lcm, arr[i]);
        }

        return lcm;
    }

    /**
     * 최대공약수
     */
    private static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}