package company.others;

import java.util.*;

/**
 * Created by dss886 on 16/9/5.
 * From the online test of JD.com at 16/09/05
 */
public class ShoppingList {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = scanner.nextInt();
            }
            Arrays.sort(prices);
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                String key = scanner.next();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
            List<HashMap.Entry<String, Integer>> data = new ArrayList<>(map.entrySet());
            Collections.sort(data, (o1, o2) -> {
                if (o2.getValue() != null && o1.getValue() != null && o2.getValue().compareTo(o1.getValue()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            });
            int min = 0, max = 0;
            for (int i = 0; i < data.size(); i++) {
                min += data.get(i).getValue() * prices[i];
                max += data.get(i).getValue() * prices[prices.length - 1 - i];
            }
            System.out.println(min + " " + max);
        }
    }
}
