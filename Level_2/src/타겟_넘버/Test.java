package 타겟_넘버;

/**
 * @title  : 타겟 넘버
 * @author : jaeha-dev (Git)
 * @refer  : https://jjjayyy.tistory.com/87 (DFS/BFS 개념)
 *           https://lkhlkh23.tistory.com/74 (배열의 요소를 노드라 가정한다면 배열의 인덱스는 깊이와 같다.)
 */
public class Test {

    public static void main(String[] args) {
        // -1+1+1 = 1
        // +1-1+1 = 1
        // +1+1-1 = 1
        System.out.println(solution(new int[]{1, 1, 1}, 1));
        // -1+1+1+1+1 = 3
        // +1-1+1+1+1 = 3
        // +1+1-1+1+1 = 3
        // +1+1+1-1+1 = 3
        // +1+1+1+1-1 = 3
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

    /**
     * 풀이
     * @param numbers : 사용할 수 있는 숫자 배열
     * @param target  : 만들어야하는 타겟 숫자
     * @return        : 타겟 숫자를 만드는 방법의 개수
     */
    private static int solution(int[] numbers, int target) {
        // 루트 노드(0)와 합계(0)를 지정하여 메소드를 호출한다.
        return dfs(numbers, target, 0, 0);
    }

    /**
     * 깊이 우선 탐색
     */
    private static int dfs(int[] numbers, int target, int node, int sum) {
        // 최대 깊이에 도달한 경우,
        if (node == numbers.length) {
            // 타겟 숫자와 합계가 같을 경우, 경우의 수를 1개 추가한다.
            return (target == sum) ? 1 : 0;

        // 아닌 경우, 다음 노드에 대해 재귀 호출
        } else {
            return dfs(numbers, target, node + 1, sum + numbers[node]) +
                   dfs(numbers, target, node + 1, sum - numbers[node]);
        }
    }

    // 배열: [1, 1, 1], 타겟: 1 (예시에서 편의상 numbers, target은 생략하고 node와 sum만 사용한다.)
    // 1. dfs(0, 0)
    // 2. dfs(1, 1) + dfs(1, -1)
    // 3. (dfs(2, 2) + dfs(2, 0)) + (dfs(2, 0), dfs(2, -2))
    // 4. ((dfs(3, 3) + dfs(3, 1)) + ((dfs(3, 1) + dfs(3, -1))
    //    + ((dfs(3, 1) + dfs(3, -1)) + ((dfs(3, -1) + dfs(3, -3))
    //
    // 4번에서 각 호출의 결과값은 아래와 같다. (두 번째 인자 값이 sum이므로 이 값이 target(1)과 같다면 경우의 수 1 추가)
    // dfs(3, 3)  = 0
    // dfs(3, 1)  = 1
    // dfs(3, 1)  = 1
    // dfs(3, -1) = 0
    // dfs(3, 1)  = 1
    // dfs(3, -1) = 0
    // dfs(3, -1) = 0
    // dfs(3, -3) = 0
    // 경우의 수는 3개이다.
}