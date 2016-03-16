package solutions.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 2016/3/16.
 * https://leetcode.com/problems/summary-ranges/
 */
public class No228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int head = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                list.add(head == nums[i - 1] ? String.valueOf(head) : head + "->" + nums[i - 1]);
                head = nums[i];
            }
        }
        list.add(head == nums[nums.length - 1] ? String.valueOf(head) : head + "->" + nums[nums.length - 1]);
        return list;
    }
}
