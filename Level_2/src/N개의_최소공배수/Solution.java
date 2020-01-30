package N개의_최소공배수;

class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0] * arr[1] / getGcd(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            lcm = lcm * arr[i] / getGcd(lcm, arr[i]);
        }

        return lcm;
    }

    public static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}