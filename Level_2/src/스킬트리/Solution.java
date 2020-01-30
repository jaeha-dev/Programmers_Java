package 스킬트리;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            boolean isPossible = true;
            int cursor = 0;

            String[] skills = skill_tree.split("");

            for (String s : skills) {
                if (cursor < skill.indexOf(s)) {
                    isPossible = false;
                    break;

                } else if (cursor == skill.indexOf(s)) {
                    cursor++;
                }
            }

            if (isPossible) {
                answer++;
            }
        }

        return answer;
    }
}