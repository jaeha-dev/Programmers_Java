package 완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

/**
 * @title  : 완주하지 못한 선수
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        String[] arr1 = {"leo", "kiki", "eden"};
        String[] arr2 = {"eden", "kiki"};

        String[] arr3 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] arr4 = {"josipa", "filipa", "marina", "nikola"};

        String[] arr5 = {"mislav", "stanko", "mislav", "ana"};
        String[] arr6 = {"stanko", "ana", "mislav"};

        System.out.println(solution(arr1, arr2));
        System.out.println(solution(arr3, arr4));
        System.out.println(solution(arr5, arr6));
    }

    /**
     * 풀이
     * @param participant : 마라톤에 참여한 선수들의 이름
     * @param completion  : 마라톤에 완주한 선수들의 이름
     * @return answer     : 완주하지 못한 선수의 이름
     */
    private static String solution(String[] participant, String[] completion) {

        // 이름과 인원수를 저장하도록 맵을 사용한다.
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            // getOrDefault(): 찾는 키가 존재할 경우, 키의 값을 반환하고
            //                 없을 경우, 기본 값을 반환한다.
            map.put(s, map.getOrDefault(s, 0) + 1);

            // System.out.println("참여: " + map);
        }

        // 완주한 선수의 인원수를 뺀다.
        for (String s : completion) {
            map.put(s, map.get(s) - 1);

            // System.out.println("완주: " + map);
        }

        String answer = "";

        // 인원수가 0이 아닌 선수는 완주하지 못한 선수이다.
        for (String s : participant) {
            if (map.get(s) != 0) {
                answer = s;
            }
        }

        // for (String s : map.keySet()) {
        //     if (map.get(s) != 0) {
        //         answer = s;
        //     }
        // }

        return answer;
    }
}