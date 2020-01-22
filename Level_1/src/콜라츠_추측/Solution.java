package 콜라츠_추측;

class Solution {
    public int solution(int num) {
        int count = 0;

        while (num != 1) {
            if (count++ == 500) {
                count = -1;
                break;
            }

            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
            }
        }

        return count;
    }
}