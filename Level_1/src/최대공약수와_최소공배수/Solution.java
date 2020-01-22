package 최대공약수와_최소공배수;

class Solution {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGcd(n, m);
        answer[1] = getLcm(n, m);

        return answer;
    }

    public int getGcd(int n, int m) {
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return n;
    }

    public int getLcm(int n, int m) {
        return n * m / getGcd(n, m);
    }
}