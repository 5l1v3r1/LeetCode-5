package company.others;

import java.util.*;

/**
 * Created by dss886 on 16/9/6.
 * From online test of xiaojukeji.com at 2016/09/06.
 *
 * Case pass 20%, didn't tell me if it is WA or TLE.
 */
public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        List<People> peopleList = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            People p = new People();
            p.num = scanner.nextInt();
            p.cost = scanner.nextInt();
            peopleList.add(p);
        }

        //noinspection Convert2Lambda
        Collections.sort(peopleList, new Comparator<People>() {
            @Override
            public int compare(People p1, People p2) {
                if (p1.num < p2.num) return -1;
                if (p1.num > p2.num) return 1;
                if (p1.cost < p2.cost) return -1;
                if (p1.cost > p2.cost) return 1;
                return 0;
            }
        });
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += pick(a[i], peopleList);
        }
        System.out.println(sum);
    }

    private static int pick(int chairs, List<People> peopleList) {
        for (int i = peopleList.size() - 1; i >= 0; i--) {
            if (peopleList.get(i).num > chairs) {
                peopleList.remove(i);
                continue;
            }
            int result = peopleList.get(i).cost;
            peopleList.remove(i);
            return result;
        }
        return 0;
    }

    private static class People {
        int num;
        int cost;
    }
}
