package solutions.medium;

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
}
