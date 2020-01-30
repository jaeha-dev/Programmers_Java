package 카카오_비밀지도;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] temp = new int[n];
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
            temp[i] = operateOR(arr1[i], arr2[i]);
            map[i] = stringToBinaryString(n, Integer.toBinaryString(temp[i]));
        }

        return map;
    }

    public int operateOR(int row1, int row2) {
        return row1 | row2;
    }

    public String stringToBinaryString(int n, String row) {
        if (row.length() < n) {
            row = String.format("%0" + n + "d", Integer.parseInt(row));
        }

        row = row.replace("0", " ")
                .replace("1", "#");

        return row;
    }
}