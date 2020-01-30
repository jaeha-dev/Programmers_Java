package 카카오_오픈채팅방;

import java.util.*;

/**
 * @title  : 카카오 오픈채팅방
 * @author : jaeha-dev (Git)
 */
public class Test {

    private static final String ENTER = "Enter";
    private static final String LEAVE = "Leave";
    private static final String WHITE_SPACE = " ";

    public static void main(String[] args) {
        String[] arr1 = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        // ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
        System.out.println(Arrays.toString(solution(arr1)));
    }

    /**
     * 풀이
     * @param records : 입장/퇴장 및 닉네임 변경 기록이 담긴 문자열 배열
     * @return        : 최종적으로 방을 개설한 사람이 보게 되는 메시지
     */
    private static String[] solution(String[] records) {
        return updateIDRecord(records);
    }

    /**
     * ID별 기록을 맵에 저장한 후, 처리한다.
     */
    private static String[] updateIDRecord(String[] records) {
        Map<String, String> map = new HashMap<>();

        for (String record : records) {
            // 레코드 1개를 가져와 처리한다.
            String[] keyword = record.split(WHITE_SPACE);

            if (! keyword[0].equals(LEAVE)) {
                map.put(keyword[1], keyword[2]);
            }
        }

        // 원본 배열과 갱신된 ID 맵
        return makeRecord(records, map);
    }

    /**
     * 최종 메시지 배열을 생성한다.
     */
    private static String[] makeRecord(String[] records, Map<String, String> map) {
        List<String> recordList = new ArrayList<>();

        for (String record : records) {
            String[] keyword = record.split(WHITE_SPACE);

            if (keyword[0].equals(ENTER)) {
                recordList.add(map.get(keyword[1]) + "님이 들어왔습니다.");

            } else if (keyword[0].equals(LEAVE)) {
                recordList.add(map.get(keyword[1]) + "님이 나갔습니다.");
            }
        }

        String[] result = new String[recordList.size()];

        for (int i = 0; i < recordList.size(); i++) {
            result[i] = recordList.get(i);
        }

        return result;
    }
}