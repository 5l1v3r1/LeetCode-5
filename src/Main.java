import others.stucture.ListNode;
import others.stucture.TreeNode;
import others.tool.Parser;
import others.tool.Printer;
import solutions.medium.*;

public class Main {

    public static void main(String[] args) {
//        ListNode head = Parser.list("[1, 2, 3, 4]");
        TreeNode root = Parser.tree("[8, 3, 10, 1, 6, #, 14, #, #, 4, 7, 13]");
        Printer.p(Printer.countTreeLevel(root));
//        Printer.p(new No035().searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

}
