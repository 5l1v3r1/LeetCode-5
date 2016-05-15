import others.stucture.ListNode;
import others.stucture.TreeNode;
import others.tool.Parser;
import others.tool.Printer;
import solutions.medium.*;

public class Main {

    public static void main(String[] args) {
        ListNode head = Parser.list("[1, 2, 3, 4]");
        TreeNode root = Parser.tree("[1, 2, 3, 4, #, 5, #, 6, #, #, #, 7]");
        Printer.p(new No343().integerBreak(8));
    }

}
