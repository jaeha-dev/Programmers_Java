package 문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                System.out.println((o1.charAt(n) - o2.charAt(n)));

                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1; // A > B

                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                    // return 0; // A == B

                } else if (o1.charAt(n) < o2.charAt(n)) {
                    return -1; // A < B

                } else {
                    return 0;
                }
            }
        });

        return strings;
    }
}