package 카카오_다트_게임;

class Solution {

    public int solution(String result) {
        return calScore(result);
    }

    public boolean isNumber(String score) {
        boolean isNumber = false;

        try {
            Integer.parseInt(score);
            isNumber = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return isNumber;
    }

    public int calScore(String result) {
        int arrCursor = 0;
        int[] scoreArr = new int[3];
        StringBuilder tempScore = new StringBuilder();

        for (char c : result.toCharArray()) {
            if (Character.isDigit(c)) {
                tempScore.append(c);

            } else {
                if (! tempScore.toString().isEmpty() && isNumber(tempScore.toString())) {
                    scoreArr[arrCursor++] = Integer.parseInt(tempScore.toString());
                    tempScore.setLength(0);
                }

                switch (c) {
                    case 'S': // Single
                        scoreArr[arrCursor - 1] = (int) Math.pow(scoreArr[arrCursor - 1], 1);
                        break;

                    case 'D': // Double
                        scoreArr[arrCursor - 1] = (int) Math.pow(scoreArr[arrCursor - 1], 2);
                        break;

                    case 'T': // Triple
                        scoreArr[arrCursor - 1] = (int) Math.pow(scoreArr[arrCursor - 1], 3);
                        break;

                    case '*': // 스타상
                        scoreArr[arrCursor - 1] = scoreArr[arrCursor - 1] * 2;
                        if (arrCursor - 2 >= 0) {
                            scoreArr[arrCursor - 2] = scoreArr[arrCursor - 2] * 2;
                        }
                        break;

                    case '#': // 아차상
                        scoreArr[arrCursor - 1] = scoreArr[arrCursor - 1] * -1;
                        break;

                    default:
                        break;
                }
            }
        }

        return scoreArr[0] + scoreArr[1] + scoreArr[2];
    }
}