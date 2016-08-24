package leetcode.easy;

import others.helper.GuessGame;

/**
 * Created by dss886 on 16/8/23.
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */
public class No374 extends GuessGame{
    public int guessNumber(int n) {
        return guessHelper(1, n);
    }

    private int guessHelper(int start, int end) {
        int guess = (end - start) / 2 + start;
        int result = guess(guess);
        if (result == 0) {
            return guess;
        } else if (result == -1) {
            return guessHelper(start, guess - 1);
        } else {
            return guessHelper(guess + 1, end);
        }
    }
}
