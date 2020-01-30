package 카카오_오픈채팅방;

import java.util.*;

class Solution {

    private static final String ENTER = "Enter";
    private static final String LEAVE = "Leave";
    private static final String WHITE_SPACE = " ";

    public String[] solution(String[] records) {
        return updateIDRecord(records);
    }

    public static String[] updateIDRecord(String[] records) {
        Map<String, String> map = new HashMap<>();

        for (String record : records) {
            String[] keyword = record.split(WHITE_SPACE);

            if (! keyword[0].equals(LEAVE)) {
                map.put(keyword[1], keyword[2]);
            }
        }

        return makeRecord(records, map);
    }

    public static String[] makeRecord(String[] records, Map<String, String> map) {
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