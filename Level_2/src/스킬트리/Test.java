package 스킬트리;

/**
 * @title  : 스킬트리
 * @author : jaeha-dev (Git)
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"})); // 2
    }

    /**
     * 풀이
     * @param skill       : 스킬 순서
     * @param skill_trees : 스킬 트리
     * @return answer     : 사용 가능한 스킬 트리 개수
     */
    private static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            boolean isPossible = true;
            int cursor = 0;

            String[] skills = skill_tree.split("");

            for (String s : skills) {
                if (cursor < skill.indexOf(s)) {
                    // CBD.indexOf('B') -> 0 < 1 -> isPossible = false -> break;
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