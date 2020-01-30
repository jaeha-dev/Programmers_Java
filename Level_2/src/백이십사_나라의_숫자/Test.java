package 백이십사_나라의_숫자;

/**
 * @title  : 124 나라의 숫자
 * @author : jaeha-dev (Git)
 * @refer  : https://giantpark197cm.tistory.com/181
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(1)); // 1
        System.out.println(solution(2)); // 2
        System.out.println(solution(3)); // 4
        System.out.println(solution(4)); // 11
        System.out.println(solution(5)); // 12
        System.out.println(solution(6)); // 14
        System.out.println(solution(7)); // 21
        System.out.println(solution(8)); // 22
        System.out.println(solution(9)); // 24
        System.out.println(solution(10)); // 41
        System.out.println(solution(11)); // 42
        System.out.println(solution(12)); // 44
        System.out.println(solution(13)); // 111
        System.out.println(solution(14)); // 112
        System.out.println(solution(15)); // 114
        System.out.println(solution(16)); // 121
        System.out.println(solution(17)); // 122
        System.out.println(solution(18)); // 124
        System.out.println(solution(19)); // 141
        System.out.println(solution(20)); // 142
        System.out.println(solution(21)); // 144
    }

    /**
     * 풀이
     * @param n       : 자연수
     * @return answer : 124 나라의 숫자
     */
    private static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n != 0) {
            if (n % 3 == 0) {
                answer.insert(0, "4");
                n = n/3 - 1;
            } else {
                answer.insert(0, n % 3);
                n = n/3;
            }
        }

        return answer.toString();
    }
}