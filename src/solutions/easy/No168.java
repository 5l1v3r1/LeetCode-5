package solutions.easy;

/**
 * Created by dss886 on 2016/3/7.
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class No168 {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            // ASCII: A-65, a-97
            stringBuilder.insert(0, (char) ((n - 1) % 26 + 65));
            n = (n - 1) / 26;
        }
        return stringBuilder.toString();
    }
}
