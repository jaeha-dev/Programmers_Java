package 체육복;

class Test_2 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        for (int value : lost) {
            boolean rent = false;

            int j = 0;

            while (! rent) {
                if (j == reserve.length) {
                    break;
                }

                if (value == reserve[j]) {
                    reserve[j] = -1;
                    rent = true;
                } else if (value - reserve[j] == 1) {
                    reserve[j] = -1;
                    rent = true;
                } else if (value - reserve[j] == -1) {
                    reserve[j] = -1;
                    rent = true;
                } else {
                    j++;
                }
            }

            if (! rent) {
                answer--;
            }
        }

        return answer;
    }
}