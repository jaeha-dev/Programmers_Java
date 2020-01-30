package 피보나치_수;

class Solution {
    public int solution(int n) {
        return getFibonacci(n) % 1234567;
    }

    public static int getFibonacci(int n) {
        int f0 = 0, f1 = 1, fi = 0;

        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            for (int i = 2; i <= n; i++) {
                fi = (f0 + f1) % 1234567;
                f0 = f1 % 1234567;
                f1 = fi % 1234567;
            }
        }

        return fi;
    }
}