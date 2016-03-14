import solutions.easy.*;
import util.TreeNode;

public class Main {

    public static void main(String[] args) {
//        new No172().trailingZeroes(1000);

//        System.out.println(new No009().isPalindrome(13532));

//        TreeNode node = new TreeNode(1);
//        new No107().levelOrderBottom(node);

        char[][] chars = new char[][]{".87654321".toCharArray(),"2........".toCharArray()
                ,"3........".toCharArray(),"4........".toCharArray(),"5........".toCharArray()
                ,"6........".toCharArray(),"7........".toCharArray(),"8........".toCharArray()
                ,"9........".toCharArray()};
        System.out.println(new No036().isValidSudoku(chars));
    }
}
