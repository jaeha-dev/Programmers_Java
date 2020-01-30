package 위장;

import java.util.HashMap;
import java.util.Map;

/**
 * @title  : H-Index
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        String[] arr1 = new String[]{"yellow_hat", "headgear"};
        String[] arr2 = new String[]{"blue_sunglasses", "eyewear"};
        String[] arr3 = new String[]{"green_turban", "headgear"};

        String[] arr4 = new String[]{"crow_mask", "face"};
        String[] arr5 = new String[]{"blue_sunglasses", "face"};
        String[] arr6 = new String[]{"smoky_makeup", "face"};

        // [[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]] -> 5
        System.out.println(solution(new String[][]{arr1, arr2, arr3}));

        // [[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]] -> 3
        System.out.println(solution(new String[][]{arr4, arr5, arr6}));
    }

    /**
     * 풀이
     * : Map 구조를 사용하여 중복을 제외한다.
     * @param clothes : 의상
     * @return answer : 서로 다른 조합의 개수
     */
    private static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            // 키는 [의상 종류]로 둔다.
            String key = clothes[i][1];

            if (map.containsKey(key)) {
                // 키가 동일할 경우, 가지 수++ (put 메소드를 사용해도 동일하다.)
                map.replace(key, map.get(key) + 1);

            } else {
                // 키를 새로 추가할 경우, 가지 수를 1개로 둔다.
                // (i는 초기 값이 0이므로 i를 사용하지 않도록 한다.)
                map.put(key, 1);
            }
        }

        return count(map);
    }

    /**
     * 카운팅
     */
    private static int count(Map<String, Integer> map) {
        int count = 1;

        for (int value : map.values()) {
            // (A 종류의 옷 가지 수 + 1) * (B 종류의 옷 가지 수 + 1) - 1
            // +1: 각 종류별로 선택할지 안 할지 여부
            // -1: 아무 것도 선택하지 않은 경우
            count *= (value + 1);
        }

        return count - 1;
    }

    // 1. arr1, arr2, arr3
    // map = [headgear:2, eyewear:1]
    //       (의상 종류가 키로, 의상 개수가 값으로 저장되는 것)
    // 따라서 전체 경우의 수는 headgear(1), headgear(2), eyewear(1), headgear(1) + eyewear(1), headgear(2) + eyewear(1)로 5개이다.
}