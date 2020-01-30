package 전화번호_목록;

class Solution {
    public boolean solution(String[] phone_book) {
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