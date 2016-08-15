package leetcode.easy;

/**
 * Created by dss886 on 2016/3/19.
 * https://leetcode.com/problems/string-to-integer-atoi/
 *
 * This solution used a long-type num to detect if the value is big than Integer.MAX_VALUE,
 * which may be seen as cheating. The Right way to do it is:
 *      if (result >= Integer.MAX_VALUE / 10 && Character.getNumericValue(c) >= Integer.MAX_VALUE % 10)
 * Also if we count the value of Integer.MAX_VALUE / 10 and Integer.MAX_VALUE % 10 advanced,
 * it is faster than casting type long to int as the solution below.
 */
public class No008 {
    public int myAtoi(String str) {
        int result = 0, factor = 1;
        boolean numStart = false;
        for (char c : str.toCharArray()) {
            if (!numStart && c == ' ') continue;
            if (!numStart && c == '-') { numStart = true; factor = -1; continue; }
            if (!numStart && c == '+') { numStart = true; continue; }
            if ('0' <= c && c <= '9') {
                numStart = true;
                long num = ((long) result) * 10 + factor * Character.getNumericValue(c);
                if (factor == 1) result = num > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) num;
                else result = num < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) num;
            } else {
                return result;
            }
        }
        return result;
    }
}
