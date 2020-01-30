package 큰_수_만들기;

/**
 * @title  : 큰 수 만들기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        // k개의 숫자를 제거했을 때, 결과의 순서를 임의로 변경하여 큰 수를 도출하지 않는다.
        System.out.println(solution("1924", 2)); // 94
        System.out.println(solution("18294", 3)); // 94
        System.out.println(solution("1231234", 3)); // 3234
        System.out.println(solution("4177252841", 4)); // 775841
    }

    /**
     * 풀이
     * @param number  : 입력 문자열
     * @param k       : 제거할 개수
     * @return answer : 가장 큰 숫자
     */
    private static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int cursor = 0;
        char max;

        for (int i = 0; i < number.length() - k; i++) {
            max = '0';

            for (int j = cursor; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    cursor = j + 1;
                }
            }

            answer.append(max);
        }

        return answer.toString();
    }
}