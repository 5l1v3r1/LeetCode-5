package leetcode.medium;

/**
 * Created by dss886 on 16/8/4.
 * https://leetcode.com/problems/minimum-path-sum/
 */
public class No064 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int[][] pathSumMap = new int[grid.length][grid[0].length];
        return getPathSum(grid, pathSumMap, 0, 0);
    }

    private int getPathSum(int[][] map, int[][] pathNumMap, int x, int y) {
        if (x == map.length - 1 && y == map[0].length - 1) return map[x][y];
        if (x >= map.length|| y >= map[0].length) return Integer.MAX_VALUE;
        if (pathNumMap[x][y] == 0) {
            pathNumMap[x][y] = Math.min(getPathSum(map, pathNumMap, x + 1, y), getPathSum(map, pathNumMap, x, y + 1)) + map[x][y];
        }
        return pathNumMap[x][y];
    }

    private int dpLoop(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];
        result[0][0] = grid[0][0];
        for (int i = 1; i < m; i++){
            result[i][0] = result[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            result[0][j] = result[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
            }
        }
        return result[m - 1][n - 1];
    }
}
