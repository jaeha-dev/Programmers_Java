package 서울에서_김서방_찾기;

/**
 * @title  : 서울에서 김서방 찾기
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
        System.out.println(solution(new String[]{"Jane", "John", "Kim"}));
        System.out.println(solution(new String[]{"Kim", "Jane", "Mike"}));
    }

    /**
     * 풀이
     * @param seoul   : 입력 배열
     * @return answer : 위치 값
     */
    private static String solution(String[] seoul) {
        int x = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
            }
        }

        return "김서방은 " + x + "에 있다";
    }
}