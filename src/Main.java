import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        TrieNode root = new TrieNode();
        for (int i = 0; i < N; i++) {
            boolean isAllow = scanner.next().equals("allow");
            String[] ipAndMask = scanner.next().split("/");
            int ip = parseIP(ipAndMask[0]);
            int mask = ipAndMask.length > 1 ? Integer.parseInt(ipAndMask[1]) : 32;
            insertRule(root, ip, mask, isAllow, i + 1);
        }
        for (int i = 0; i < M; i++) {
            int ip = parseIP(scanner.next());
            System.out.println(matchRule(root, ip) ? "YES" : "NO");
        }
    }

    private static void insertRule(TrieNode node, int ip, int mask, boolean isAllow, int position) {
        if (mask == 0) {
            if (!node.isRule){
                node.allow = isAllow;
                node.isRule = true;
            }
            return;
        }
        for (int i = 0; i < mask; i++) {
            int digit = getDigit(ip, i);
            if (digit == 0) {
                if (node.left == null) node.left = new TrieNode();
                node = node.left;
            } else {
                if (node.right == null) node.right = new TrieNode();
                node = node.right;
            }
            if (node.isRule) return;
            node.value = position;
            node.allow = isAllow;
        }
        node.isRule = true;
    }

    private static boolean matchRule(TrieNode node, int ip) {
        TrieNode lastRule = node;
        for (int i = 0; i < 32; i++) {
            if (node.isRule) lastRule = node;
            int digit = getDigit(ip, i);
            if (digit == 0) {
                if (node.left == null) return lastRule.allow;
                node = node.left;
            } else {
                if (node.right == null) return lastRule.allow;
                node = node.right;
            }
        }
        return lastRule.allow;
    }

    private static int getDigit(int ip, int i) {
        String ipString = Integer.toBinaryString(ip);
        return i < 32 - ipString.length() ? 0 : (ipString.charAt(i - 32 + ipString.length()) - '0');
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

    private static class TrieNode {
        boolean allow = true;
        boolean isRule = false;      // if it is a rule node
        int value = 0;               // the index of rules
        TrieNode left;
        TrieNode right;
    }
}
