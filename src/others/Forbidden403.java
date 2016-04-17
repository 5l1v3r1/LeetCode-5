package others;

import java.util.Scanner;

/**
 * Created by dss886 on 2016/4/6.
 */
public class Forbidden403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Rule[] rules = new Rule[N];
        for (int i = 0; i < N; i++) {
            rules[i] = new Rule();
            rules[i].isAllow = scanner.next().equals("allow");
            String[] ipAndMask = scanner.next().split("/");
            rules[i].ip = parseIP(ipAndMask[0]);
            rules[i].mask = ipAndMask.length > 1 ? Integer.parseInt(ipAndMask[1]) : 32;
        }
        M:
        for (int i = 0; i < M; i++) {
            String ip = parseIP(scanner.next());
            for (Rule rule : rules) {
                if (matchIP(rule, ip)) {
                    System.out.println(rule.isAllow ? "YES" : "NO");
                    continue M;
                }
            }
            System.out.println("YES");
        }
    }

    private static boolean matchIP(Rule rule, String ip) {
        for (int i = 0; i < rule.mask; i++) {
            if (ip.charAt(i) != rule.ip.charAt(i)) return false;
        }
        return true;
    }

    private static String parseIP(String ip) {
        String[] ips = ip.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String quart = Integer.toBinaryString(Integer.parseInt(ips[i]));
            for (int j = 0; j < 8 - quart.length(); j++) sb.append("0");
            sb.append(quart);
        }
        return sb.toString();
    }

    private static class Rule {
        public boolean isAllow;
        public String ip;
        public int mask;
    }
}
