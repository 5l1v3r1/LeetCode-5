package leetcode.medium;

/**
 * Created by dss886 on 2016/4/2.
 * https://leetcode.com/problems/integer-to-roman/
 *
 * See Amazing Solution at:
 * https://leetcode.com/discuss/32626/simple-solution
 */
public class No012 {

    int[] roman = {0, 1, 5, 10, 50, 100, 500, 1000};
    char[] chars = {0, 'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    private String intToRoman(int num) {
        if (num == 0) return "";
        for (int i = roman.length - 1; i > 0; i--) {
            if (isThisLevel(num, i)) {
                StringBuilder sb = new StringBuilder(String.valueOf(chars[i]));
                if (num == roman[i]) return sb.toString();
                if (num > roman[i]) return sb.append(intToRoman(num - roman[i])).toString();
                int left = getValidLeftIndex(i);
                sb.insert(0, chars[left]);
                return sb.append(intToRoman(num - (roman[i] - roman[left]))).toString();
            }
        }
        return "";
    }

    private boolean isThisLevel(int num, int i) {
        return i == 1 || num >= roman[i] - roman[getValidLeftIndex(i)];
    }

    private int getValidLeftIndex(int i) {
        return i - 1 - i % 2;
    }
}
