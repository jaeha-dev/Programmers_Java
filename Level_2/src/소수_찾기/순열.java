package 소수_찾기;

/**
 * @title  : 순열
 * @author : jaeha-dev (Git)
 * @refer  : https://gorakgarak.tistory.com/522
 */
public class 순열 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        perm(arr, 0, 4, 4);
    }

    private static void perm(int[] arr, int depth, int n, int k) {
        if (depth == k) {
            // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
            print(arr, k);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, k);
            swap(arr, i, depth);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}