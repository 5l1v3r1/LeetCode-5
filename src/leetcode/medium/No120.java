package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 16/8/19.
 * https://leetcode.com/problems/triangle/
 *
 * Time cost: 32 min
 * Counted from bottom to top may be more efficient.
 */
public class No120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        List<List<Integer>> cache = new ArrayList<>();
        initCache(cache, triangle.size());
        return minimumWithCache(triangle, cache, 0, 0);
    }

    private void initCache(List<List<Integer>> cache, int depth) {
        for (int i = 0; i < depth; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(Integer.MAX_VALUE);
            }
            cache.add(list);
        }
    }

    private int minimumWithCache(List<List<Integer>> triangle, List<List<Integer>> cache, int depth, int index) {
        int maxDepth = triangle.size() - 1;
        if (depth == maxDepth) return triangle.get(depth).get(index);
        if (cache.get(depth).get(index) != Integer.MAX_VALUE) return cache.get(depth).get(index);
        int left = minimumWithCache(triangle, cache, depth + 1, index);
        int right = minimumWithCache(triangle, cache,  depth + 1, index + 1);
        int min = triangle.get(depth).get(index) + Math.min(left, right);
        cache.get(depth).set(index, min);
        return min;
    }

}
