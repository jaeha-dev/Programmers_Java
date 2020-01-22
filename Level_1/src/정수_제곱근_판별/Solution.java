package 정수_제곱근_판별;

class Solution {
    public long solution(long n) {
        double d = Math.sqrt(n);

        if (n == Math.pow((int) d, 2)) {
            return (long) Math.pow(d + 1, 2);
        }

        return -1;
    }
}