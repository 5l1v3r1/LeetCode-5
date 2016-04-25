import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
//        Rule[] rules = new Rule[N];
//        for (int i = 0; i < N; i++) {
//            rules[i] = new Rule();
//            rules[i].isAllow = scanner.next().equals("allow");
//            String[] ipAndMask = scanner.next().split("/");
//            rules[i].ip = parseIP(ipAndMask[0]);
//            rules[i].mask = ipAndMask.length > 1 ? Integer.parseInt(ipAndMask[1]) : 32;
//        }
//        M:
//        for (int i = 0; i < M; i++) {
//            int ip = parseIP(scanner.next());
//            for (Rule rule : rules) {
//                if (matchIP(rule, ip)) {
//                    System.out.println(rule.isAllow ? "YES" : "NO");
//                    continue M;
//                }
//            }
//            System.out.println("YES");
//        }
        TrieNode root = null;
        for (int i = 0; i < N; i++) {
            Rule rule = new Rule();
            rule.isAllow = scanner.next().equals("allow");
            String[] ipAndMask = scanner.next().split("/");
            rule.ip = parseIP(ipAndMask[0]);
            rule.mask = ipAndMask.length > 1 ? Integer.parseInt(ipAndMask[1]) : 32;
            insertRule(root, rule);
        }

    }

    private static void insertRule(TrieNode root, Rule rule) {

    }

    private static boolean matchIP(Rule rule, int ip) {
        if (rule.mask == 0) return true;
        int ipAndMask = ip >>> (32 - rule.mask);
        int ruleAndMask = rule.ip >>> (32 - rule.mask);
        return ipAndMask == ruleAndMask;
    }

    private static int parseIP(String ipString) {
        String[] ips = ipString.split("\\.");
        int ip = 0;
        for (int i = 0; i < 4; i++) {
            ip = ip << 8;
            ip += Integer.parseInt(ips[i]);
        }
        return ip;
    }

    private static class Rule {
        public boolean isAllow;
        public int ip;
        public int mask;
    }

    private class TrieNode {
        public int allow;
        public int val;

        public TrieNode(int allow, int val) {
            this.allow = allow;
            this.val = val;
        }
    }
}
