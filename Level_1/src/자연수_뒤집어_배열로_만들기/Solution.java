package 자연수_뒤집어_배열로_만들기;

class Solution {
    public int[] solution(long n) {
        char[] nArr = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
        int[] answer = new int[nArr.length];

        for (int i = 0; i < nArr.length; i++) {
            answer[i] = nArr[i] - 48; // 아스키 코드이므로 원래 값을 구하기 위해 -48
        }

        return answer;
    }
}