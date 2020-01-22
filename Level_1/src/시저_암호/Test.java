package 시저_암호;

/**
 * @title  : 시저 암호
 * @author : jaeha-dev (Git)
 */
public class Test {
    // 대소문자 알파벳의 각각 개수는 26개
    // 27일 경우, 나머지가 1이므로 순환이 가능하다.
    private static final int COUNT = 26;

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    /**
     * 풀이
     * @param n      : 입력 문자열
     * @return count : 입력 거리
     */
    private static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        int loop = n % COUNT;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + loop) % COUNT + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + loop) % COUNT + 'A');
            }

            answer.append(c);
        }

        // "AB", n = 1일 경우, loop = 1
        // c = (char) ((65 - 65 + 1) % 26 + 65);
        //   = 66 = 'B'
        // c = (char) ((66 - 65 + 1) % 26 + 65);
        //   = 67 = 'C'

        // "a B z", n = 4일 경우, loop = 4
        // c = (char) ((97 - 97 + 4) % 26 + 97);
        //   = 101 = 'e'
        // c = (char) ((66 - 65 + 4) % 26 + 65);
        //   = 70 = 'F'
        // c = (char) ((122 - 97 + 4) % 26 + 97);
        //   = 100 = 'd'

        return answer.toString();
    }
}