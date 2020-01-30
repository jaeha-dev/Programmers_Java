package 전화번호_목록;

/**
 * @title  : 전화번호 목록
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"})); // F
        System.out.println(solution(new String[]{"123", "456", "789"})); // T
        System.out.println(solution(new String[]{"12", "123", "1235", "567", "88"})); // F
    }

    /**
     * 풀이
     * @param phone_book : 전화번호 배열
     * @return answer    : 결과 값
     */
    private static boolean solution(String[] phone_book) {
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 0; j < phone_book.length; j++) {
//                if (i != j && phone_book[j].startsWith(phone_book[i])) {
//                    return false;
//                }
//            }
//        }
//        return true;

        for (String s1 : phone_book) {
            for (String s2 : phone_book) {
                if (s1.equals(s2)) {
                    continue;
                }
                if (s2.startsWith(s1)) {
                    return false;
                }
            }
        }
        return true;
    }
}