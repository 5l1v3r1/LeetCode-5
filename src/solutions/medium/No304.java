package solutions.medium;

/**
 * Created by dss886 on 16/8/12.
 * https://leetcode.com/problems/range-sum-query-2d-immutable/
 *
 * Time Cost: 67 min
 */
public class No304 {

    private int[][] sum;

    public No304(int[][] matrix) {
        if (matrix.length == 0) return;
        int row = matrix.length;
        int col = matrix[0].length;
        sum = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                int left = c == 0 ? 0 : sum[r][c - 1];
                int top = r == 0 ? 0 : sum[r - 1][c];
                if (r == 0) {
                    sum[r][c] = matrix[r][c] + left;
                } else if (c == 0) {
                    sum[r][c] = matrix[r][c] + top;
                } else {
                    sum[r][c] = matrix[r][c] + top + left - sum[r - 1][c - 1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(sum == null) return 0;
        int max = sum[row2][col2];
        int left = col1 == 0 ? 0 : sum[row2][col1 - 1];
        int top = row1 == 0 ? 0 : sum[row1 - 1][col2];
        int min = 0;
        if (row1 != 0 && col1 != 0) {
            min = sum[row1 - 1][col1 - 1];
        }
        return max - left - top + min;
    }

}
