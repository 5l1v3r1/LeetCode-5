package solutions.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dss886 on 16/7/5.
 * https://leetcode.com/problems/permutations/
 *
 * Using the constructor ArrayList(List<>) to clone the origin list will be faster.
 * (because the native implement of System.arrayCopy())
 */
public class No046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int num : nums) {
            list = permuteForNum(list, num);
        }
        return list;
    }

    private List<List<Integer>> permuteForNum(List<List<Integer>> list, int num) {
        List<List<Integer>> newList = new ArrayList<>();
        if (list.size() == 0) {
            List<Integer> firstList = new ArrayList<>();
            firstList.add(num);
            newList.add(firstList);
            return newList;
        }
        for (List<Integer> subList : list) {
            for (int i = 0; i < subList.size() + 1; i++) {
                List<Integer> newSubList = new ArrayList<>();
                for (int j = 0; j < subList.size() + 1; j++) {
                    if (j < i) {
                        newSubList.add(subList.get(j));
                    } else if (j == i) {
                        newSubList.add(num);
                    } else {
                        newSubList.add(subList.get(j - 1));
                    }
                }
                newList.add(newSubList);
            }
        }
        return newList;
    }
}
