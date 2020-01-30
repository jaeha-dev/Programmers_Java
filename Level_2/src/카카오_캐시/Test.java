package 카카오_캐시;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @title  : 카카오 캐시
 * @author : jaeha-dev (Git)
 * @refer  : https://ppikanyang.tistory.com/entry/카카오-신입-공채-1차-코딩-테스트-3번-문제
 *           https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map (맵에서 가장 작은 값을 갖는 키 구하기)
 *           (Key key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();)
 */
public class Test {

    private static final int HIT_TIME = 1; // 캐시 히트
    private static final int MISS_TIME = 5; // 캐시 미스

    public static void main(String[] args) {
        // 50, 21, 60, 52, 16, 25, 8, 20
//        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
//        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
//        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
//        System.out.println(solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
//        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
//        System.out.println(solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
//        System.out.println(solution(3, new String[]{"Jeju", "Jeju", "Jeju", "Jeju"}));
//        System.out.println(solution(0, new String[]{"Jeju", "Seoul", "Jeju", "Seoul"}));

        System.out.println(solution(3, new String[]{"A", "B", "C", "D", "E", "A", "B", "C", "D", "E"}));
    }

    /**
     * 풀이
     * @param cacheSize : 캐시 크기
     * @param cities    : 도시 이름
     * @return time     : 총 실행 시간
     */
    private static int solution(int cacheSize, String[] cities) {
        return LRU(cacheSize, cities);
    }

    /**
     * 캐시 교체 및 실행 시간
     * : 캐시 크기가 0일 경우, 맵에 저장하지 않고 실행 시간만 갱신한다.
     */
    private static int LRU(int cacheSize, String[] cities) {
        int time = 0;

        // 도시 이름:저장된 시간
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < cities.length; i++) {
            // 동일한 도시를 대소문자로 구분하여 입력하는 경우, 모두 소문자로 변환한다.
            String city = cities[i].toLowerCase();

            if (map.containsKey(city)) {
                time += HIT_TIME;

                // 기존의 키에 저장된 시간(i)을 갱신한다.
                map.replace(city, i);

            } else {
                // 입력 중, 캐시 크기가 0인 경우가 있다.
                if (cacheSize > 0) {
                    if (map.size() == cacheSize) {
                        // 캐시 크기에 도달하면 가장 작은 값을 갖는 키를 제거한다.
                        map.remove(Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey());
                    }

                    // 키를 새로 추가한다.
                    map.put(city, i);
                }

                time += MISS_TIME;
            }

            // System.out.println(map.entrySet());
        }

        return time;
    }
}

//    1번 예시
//    캐시 크기: 3
//    도시 이름: A, B, C, D, E, A, B, C, D, E (모두 캐시 미스이다.)
//    [A] [ ] [ ] / time =  5
//    [A] [B] [ ] / time = 10
//    [A] [B] [C] / time = 15
//    [D] [B] [C] / time = 20
//    [D] [E] [C] / time = 25
//    [D] [E] [A] / time = 30
//    [B] [E] [A] / time = 35
//    [B] [C] [A] / time = 40
//    [B] [C] [D] / time = 45
//    [E] [C] [D] / time = 50