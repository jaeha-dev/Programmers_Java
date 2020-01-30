package 이천십육년;

import java.util.Calendar;
import java.util.Locale;

/**
 * @title  : 이천십육년
 * @author : jaeha-dev (Git)
 * @refer  : https://dk11.tistory.com/21
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution(1, 7));
        System.out.println(solution(5, 24));
    }

    /**
     * 라이브러리를 사용한 풀이
     * : ISO 8601은 국제 표준화 기구(ISO)의 표준 날짜이다.
     * @param a : 월
     * @param b : 요일
     * @return answer : a월 b일의 요일
     */
    private static String solution(int a, int b) {
        // Calender.MONTH 값이 5일 경우, 6월을 의미한다. 따라서 -1
        Calendar calendar = new Calendar.Builder().setCalendarType("iso8601")
                                                  .setDate(2016, a - 1, b).build();

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
}