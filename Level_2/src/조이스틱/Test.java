package 조이스틱;

/**
 * @title  : 조이스틱
 * @author : jaeha-dev (Git)
 * @refer  : https://taesan94.tistory.com/38
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("JEROEN")); // 56
        System.out.println(solution("JAN")); // 23
        System.out.println(solution("AAA")); // 0
    }

    /**
     * 풀이
     * : 문자(A ~ Z)는 65 ~ 90
     *   완성해야 하는 글자 수만큼 A가 기본으로 입력되므로 A는 커서 이동하여 넘어간다.
     * @param name   : 만들고자 하는 이름
     * @return count : 이름에 대해 조이스틱 조작 횟수의 최솟값
     */
    private static int solution(String name) {
        int count = 0;
        char[] names = name.toCharArray();

        for (int i = 0; i < names.length; i++) {
            char ch = names[i];

            // A일 경우
            if (ch == 65) {

            }
        }

        return count;
    }

    /**
     * 상향 방향키
     * : 다음 알파벳
     */
    private static int up(char ch) {
        return ch + 1;
    }

    /**
     * 하향 방향키
     * : 이전 알파벳 (A일 때는 Z로 이동한다.)
     */
    private static int down(char ch) {
        return 0;
    }

    /**
     * 좌향 방향키
     * : 커서를 왼쪽으로 이동 (첫 번째 위치에서는 마지막 위치로 이동한다.)
     */
    private static int left(char ch) {
        return 0;
    }

    /**
     * 우향 방향키
     * : 커서를 오른쪽으로 이동
     */
    private static int right(char ch) {
        return 0;
    }
}