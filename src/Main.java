import others.stucture.ListNode;
import others.tool.ListBuilder;
import others.tool.Print;
import solutions.easy.*;

public class Main {

    public static void main(String[] args) {
        ListNode list = ListBuilder.get(new int[]{1, 2, 3, 4});
        Print.p(new No024().swapPairs(list));
    }

}
