package solutions.easy;

/**
 * Created by dss886 on 2016/3/14.
 * https://leetcode.com/problems/valid-sudoku/
 */
public class No036 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 81; i++) {
            char curChar = board[i / 9][i % 9];
            if (curChar == '.') continue;
            for (int j = 0; j < 9 && j != i % 9; j++) {
                if (board[i /9][j] == curChar) return false;
            }
            for (int j = 0; j < 9 && j != i / 9; j++) {
                if (board[j][i % 9] == curChar) return false;
            }
            int sectionX = i % 9 / 3;
            int sectionY = i / 9 / 3;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (sectionX * 3 + j + sectionY * 27 + k * 9 == i) continue;
                    if (board[sectionY * 3 + k][sectionX * 3 + j] == curChar) return false;
                }
            }
        }
        return true;
    }
}
