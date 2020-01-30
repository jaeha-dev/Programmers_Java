package 소수_찾기;

/**
 * @title : 순열
 * @author : jaeha-dev (Git)
 * @refer : https://bcp0109.tistory.com/15
 */
public class 조합 {

    /**
     * [1, 2, 3] 배열이 있을 때, 2개의 수를 순서 없이 뽑으면 [1, 2], [1, 3], [2, 3]이 나온다.
     * 순열의 경우 [2, 1], [3, 1], [3, 2]가 추가로 나온다. (조합은 중복을 제거)
     * -> 조합은 순열의 부분 집합
     */
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];

        // 백트래킹
        for (int i = 1; i <= n; i++) {
            combination1(arr, visited, 0, n, i);
        }

        System.out.println();

        // 재귀
        for (int i = 1; i <= n; i++) {
            combination2(arr, visited, 0, n, i);
        }
    }

    /**
     * 출력
     */
    private static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    /**
     * 백트래킹
     * : arr: 조합을 뽑을 배열, visited: 조합에 뽑혔는지 체크하는 배열, n: 배열의 길이, r: 조합의 길이
     *   순열과 달리 조합은 r을 유지할 필요가 없으므로 숫자를 하나 뽑을 때마다 r--,
     *   r == 0일 때, r개의 숫자를 뽑은 상태가 된다.
     */
    private static void combination1(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;

        } else {
            for (int i = start; i < n; i++) {
                visited[i] = true;
                combination1(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
    }

    /**
     * 출력
     */
    private static void combination2(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        if (depth == n) {
            return;
        } else {
            visited[depth] = true;
            combination2(arr, visited, depth + 1, n, r - 1);

            visited[depth] = false;
            combination2(arr, visited, depth + 1, n, r);
        }
    }
}