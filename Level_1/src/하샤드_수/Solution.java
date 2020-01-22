package 하샤드_수;

class Solution {
    public boolean solution(int x) {
        return (x % calDigitSum(x) == 0);
    }

    public int calDigitSum(int x) {
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x -= x % 10;
            x /= 10;
        }

        return sum;
    }
}