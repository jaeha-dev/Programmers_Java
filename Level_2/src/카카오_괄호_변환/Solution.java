package 카카오_괄호_변환;

import java.util.Stack;

class Solution {

    public String solution(String w) {
        return arrangeCorrect(w);
    }

    public String arrangeCorrect(String w) {
        String temp = "";

        if (w.isEmpty()) return temp;

        int cursor = divide(w);
        String u = w.substring(0, cursor + 1);
        String v = w.substring(cursor + 1, w.length());

        if (isCorrect(u)) {
            return u + arrangeCorrect(v);

        } else {
            temp = '(' + arrangeCorrect(v) + ')';
            u = u.substring(1, u.length() - 1);
            u = reverse(u);

            return temp + u;
        }
    }

    public int divide(String w) {
        int openCount = 0, closeCount = 0, i;

        for (i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '(') openCount++;
            else if (w.charAt(i) == ')') closeCount++;

            if (openCount == closeCount) {
                break;
            }
        }

        return i;
    }

    public boolean isCorrect(String w) {
        Stack<Integer> stack = new Stack<>();
        boolean isCorrect = true;

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '(') {
                stack.push(1);

            } else if (w.charAt(i) == ')') {
                if (stack.empty()) {
                    isCorrect = false;
                    break;
                }
                stack.pop();
            }
        }

        return isCorrect;
    }

    public String reverse(String w) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '(') sb.append(')');
            else if (w.charAt(i) == ')') sb.append('(');
        }

        return sb.toString();
    }
}