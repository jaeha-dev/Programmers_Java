package 카카오_문자열_압축;

/**
 * @title  : 카카오 문자열 압축
 * @author : jaeha-dev (Git)
 * @refer  : https://lkhlkh23.tistory.com/153?category=815977
 */
public class Test {

    // 주어지는 문자열의 길이는 최대 1000이므로 시간 복잡도를 크게 고려하지 않아도 된다.
    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));                 // aabbaccc = 7
        System.out.println(solution("ababcdcdababcdcd"));         // 2개 단위로 압축, ababcdcd ababcdcd = 2ababcdcd = 9
        System.out.println(solution("abcabcdede"));               // 3개 단위로 압축, abc abc dede = 2abcdede = 8
        System.out.println(solution("abcabcabcabcdededededede")); // 5개 단위로 압축, abcabc abcabc dedede dedede = 2abcabc2dedede = 14
        System.out.println(solution("xababcdcdababcdcd"));        // 17
    }

    /**
     * 풀이
     * @param str        : 입력된 문자열
     * @return minLength : 압축된 문자열 길이
     */
    private static int solution(String str) {
        int minLength = 1;
        int strLength = str.length();

        if (strLength == 1) {
            // 입력된 문자열의 길이가 1일 경우
            return minLength;

        } else {
            for (int i = 1; i <= strLength / 2; i++) {
                String now = "";                            // 현재
                String next = "";                           // 다음
                StringBuilder result = new StringBuilder(); // 결과
            }
        }

        return minLength;
    }

//    private static int solution(String s) {
//        if(s.length() == 1) return 1;
//
//        int answer = 1001;
//        for (int i = 1; i <= s.length() / 2; i++) {
//            String now;
//            String next = "";
//            StringBuilder result = new StringBuilder();
//            int hit = 1;
//            for (int j = 0; j <= s.length() / i; j++) {
//                int start = j * i;
//                int end = Math.min(i * (j + 1), s.length());
//                now = next;
//                next = s.substring(start, end);
//
//                if(now.equals(next)) {
//                    hit++;
//                } else {
//                    result.append(processHit(hit)).append(now);
//                    hit = 1;
//                }
//            }
//            result.append(processHit(hit)).append(next);
//            answer = Math.min(answer, result.length());
//        }
//
//        return answer;
//    }
//
//    private static String processHit(int hit) {
//        return hit > 1 ? String.valueOf(hit) : "";
//    }
}