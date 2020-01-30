package 다음_큰_숫자;

class Solution {
    public int solution(int n) {
        return nextNumber(n);
    }

    public static int nextNumber(int n) {
        int oneBitCount = Integer.bitCount(n);
        int nextNumber = n;

        do {
            nextNumber++;
        } while (Integer.bitCount(nextNumber) != oneBitCount);

        return nextNumber;
    }
}