package 핸드폰_번호_가리기;

class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int length = phone_number.length();

        for (int i = 0; i < length - 4; i++) {
            answer.append("*");
        }

        answer.append(phone_number, length - 4, length);

        return answer.toString();
    }
}