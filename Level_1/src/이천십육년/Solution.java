package 이천십육년;

import java.util.Calendar;
import java.util.Locale;

public class Solution {

    public String solution(int a, int b) {
        Calendar calendar = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, a - 1, b).build();

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
}