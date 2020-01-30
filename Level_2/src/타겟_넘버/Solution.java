package 타겟_넘버;

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int node, int sum) {
        if (node == numbers.length) {
            return (target == sum) ? 1 : 0;
        } else {
            return dfs(numbers, target, node + 1, sum + numbers[node]) +
                    dfs(numbers, target, node + 1, sum - numbers[node]);
        }
    }
}