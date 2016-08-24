package others.helper;

/**
 * Created by dss886 on 16/8/23.
 *
 * Super class for LeetCode's Guess Game Problems:
 * No374 - Guess Number Higher or Lower
 * No375 - Guess Number Higher or Lower II
 */
public class GuessGame {

    private int pickedNum;

    public GuessGame pick(int num) {
        this.pickedNum = num;
        return this;
    }

    protected int guess(int num) {
        if (pickedNum == num) {
            return 0;
        } else if (pickedNum < num) {
            return -1;
        } else {
            return 1;
        }
    }
}
