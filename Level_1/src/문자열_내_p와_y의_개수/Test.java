package 문자열_내_p와_y의_개수;

/**
 * @title  : 문자열 내 p와 y의 개수
 * @author : jaeha-dev (Git)
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
        System.out.println(solution("Abc"));
    }

    /**
     * 풀이
     * @param s : 입력 문자열
     * @return  : 결과 값
     */
    private static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        String[] strings = s.split("");

        for (String token : strings) {
            if (token.equalsIgnoreCase("P")) {
                pCount++;
            } else if (token.equalsIgnoreCase("Y")) {
                yCount++;
            }
        }

        return (pCount == yCount);
    }
}