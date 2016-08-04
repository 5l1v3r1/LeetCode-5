package solutions.medium;

/**
 * Created by dss886 on 16/8/4.
 * https://leetcode.com/problems/unique-paths-ii/
 *
 * See simple solution at:
 * https://discuss.leetcode.com/topic/10974/short-java-solution
 */
public class No063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) return 0;
        int[][] pathNumMap = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                pathNumMap[i][j] = -1;
            }
        }
        return getUniquePath(obstacleGrid, pathNumMap, 0, 0);
    }

    private int getUniquePath(int[][] map, int[][] pathNumMap, int x, int y) {
        if (x == map.length - 1 && y == map[0].length - 1) return map[x][y] == 0 ? 1 : 0;
        if (x >= map.length|| y >= map[0].length) return 0;
        if (map[x][y] == 1) return 0;
        if (pathNumMap[x][y] == -1) {
            pathNumMap[x][y] = getUniquePath(map, pathNumMap, x + 1, y) + getUniquePath(map, pathNumMap, x, y +1);
        }
        return pathNumMap[x][y];
    }
}
