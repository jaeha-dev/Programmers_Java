package 카카오_괄호_변환;

import java.util.Stack;

/**
 * @title  : 카카오 괄호 변환
 * @author : jaeha-dev (Git)
 * @refer  : https://keepgoing0328.tistory.com/entry/2020카카오-공채-괄호-변환-자바
 */
public class Test {

    private static final char OPEN_BRACKET = '(';
    private static final char CLOSE_BRACKET = ')';

    public static void main(String[] args) {
        System.out.println(solution("(()())()")); // (()())()
        System.out.println(solution(")(")); // ()
        System.out.println(solution("()))((()")); // ()(())()
    }

    /**
     * 풀이
     * : 열기 괄호를 '(', 닫기 괄호를 ')'로 가정한다.
     * @param w : 변환할 괄호 문자열
     * @return  : 변환된 괄호 문자열
     */
    private static String solution(String w) {
        return arrangeCorrect(w);
    }

    /**
     * 올바른 괄호 문자열로 배열
     */
    private static String arrangeCorrect(String w) {
        String temp = "";

        // 입력이 빈 문자열인 경우, 빈 문자열을 반환한다. (재귀 호출의 탈출 조건이 된다.)
        if (w.isEmpty()) return temp;

        int cursor = divide(w);
        String u = w.substring(0, cursor + 1);
        String v = w.substring(cursor + 1, w.length());

        if (isCorrect(u)) {
            // u가 올바른 괄호 문자열일 때, v에 대해 생성한 올바른 괄호 문자열을 붙여서 반환한다.
            return u + arrangeCorrect(v);

        } else {
            // u가 올바른 괄호 문자열이 아닐 때,
            // 첫 번째 문자로 열기 괄호,
            // 문자열 v에 대해 재귀적으로 수행한 결과 문자열을 이어 붙인 후,
            // 마지막 문자로 닫기 괄호를 붙인다.
            temp = OPEN_BRACKET + arrangeCorrect(v) + CLOSE_BRACKET;

            // u의 첫 번째와 마지막 문자를 제거하고,
            // 나머지 문자열의 괄호 방향을 뒤집은 후, temp 뒤에 붙여서 반환한다.
            u = u.substring(1, u.length() - 1);
            u = reverse(u);

            return temp + u;
        }
    }

    /**
     * 가장 작은 크기의 균형잡힌 괄호 문자열로 자를 수 있는 인덱스 반환
     */
    private static int divide(String w) {
        int openCount = 0, closeCount = 0, i;

        for (i = 0; i < w.length(); i++) {
            if (w.charAt(i) == OPEN_BRACKET) openCount++;
            else if (w.charAt(i) == CLOSE_BRACKET) closeCount++;

            if (openCount == closeCount) {
                break;
            }
        }

        return i;
    }

    /**
     * 올바른 괄호 문자열 검사
     * : 열기 괄호와 닫기 괄호의 짝이 맞는지 검사한다.
     * : count 변수를 한 개만 두는 방법도 있다.
     *   (열기 괄호일 때 +, 닫기 괄호일 때 -하여 0이 되면 올바른 괄호 문자열이 되므로)
     */
    private static boolean isCorrect(String w) {
        Stack<Integer> stack = new Stack<>();
        boolean isCorrect = true;

        for (int i = 0; i < w.length(); i++) {
            // 열기 괄호일 때, 1 추가
            // 닫기 괄호일 때, 1 삭제
            if (w.charAt(i) == OPEN_BRACKET) {
                stack.push(1);

            } else if (w.charAt(i) == CLOSE_BRACKET) {
                if (stack.empty()) {
                    // 반복문을 모두 돌지 않은 상태에서 빈 스택일 때 더이상 1을 삭제할 수 없다. (즉, 올바른 괄호 문자열이 아님)
                    isCorrect = false;
                    break;
                }
                stack.pop();
            }
        }

        // 반복문을 모두 돌면 true 반환.
        return isCorrect;

//        int bracketCount = 0;
//
//        for (int i = 0; i < w.length(); i++) {
//            if (w.charAt(i) == OPEN_BRACKET) bracketCount++;
//            else if (w.charAt(i) == CLOSE_BRACKET) bracketCount--;
//
//            if (bracketCount < 0) return false;
//        }
//
//        return bracketCount == 0;
    }

    /**
     * 입력 문자열의 괄호를 뒤집은 문자열 반환
     * : 열기 괄호를 닫기 괄호로, 닫기 괄호를 열기 괄호로 뒤집는다.
     */
    private static String reverse(String w) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == OPEN_BRACKET) sb.append(CLOSE_BRACKET);
            else if (w.charAt(i) == CLOSE_BRACKET) sb.append(OPEN_BRACKET);
        }

        return sb.toString();
    }
}