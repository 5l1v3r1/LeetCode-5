package company.others;

import java.util.*;

/**
 * Created by dss886 on 16/9/9.
 * From the online written test of Alibaba.com at 2016/09/09.
 *
 * 写段代码，定义一个字符串常量，字符串中只有大小写字母和整数，输出字符串中的现最多的数字的和？
 * 例如"9fiI3dj11P0jAsf11j"中出现最多的是11两次，输出22
 */
public class MaxNumInString {
    public int maxNum(String input) {
        if (input == null || input.length() == 0) return 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length();){
            char c = input.charAt(i);
            if('0' <= c && c <='9'){
                String numString = getNumString(input, i);
                if (map.containsKey(numString)){
                    map.put(numString, map.get(numString) + 1);
                } else {
                    map.put(numString, 1);
                }
                i += numString.length();
            } else {
                i++;
            }
        }
        List<HashMap.Entry<String, Integer>> data = new ArrayList<>(map.entrySet());
        Collections.sort(data, (o1, o2) -> {
            if (o1.getValue() < o2.getValue()) return 1;
            if (o1.getValue() > o2.getValue()) return -1;
            return 0;
        });
        return data.size() == 0 ? 0 : (Integer.parseInt(data.get(0).getKey()) * data.get(0).getValue());
    }

    private String getNumString(String input, int start) {
        int end = start + 1;
        for (int i = end; i < input.length(); i++) {
            char c = input.charAt(end);
            if ('0' <= c && c <= '9') {
                end++;
            } else {
                break;
            }
        }
        return input.substring(start, end);
    }
}
