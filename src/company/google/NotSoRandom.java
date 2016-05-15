package company.google;

import java.util.Scanner;

/**
 * Created by dss886 on 2016/5/14.
 *
 * From the Round-E APAC Test of Google 2016 (Problem C)
 * https://code.google.com/codejam/contest/8264486/dashboard#s=p2
 *
 * The main solving ideas:
 * 1. All Three operation is bit-based, so we can look into the operation of single bit.
 * 2. Instead of considering the 3 operations and their probabilities, we can just think about the input and output
 *    probability of 0-1, then we got two matrices as below:
 *        k = 0: [ 100 ,  0   ] , k = 1: [  A  , B + C ]
 *               [  A  , B+C  ]          [  C  , A + B ]
 *    (which means: when x=0 and k=1, the output got 0 by chance of A%, and 1 by chance of (B+C)%)
 * 3. When have N copies of this RNG in series, we multiply the matrices to itself by N-1 times, then we got the total
 *    system's output matrices.
 * 4. Now for every bit of X and K, we can calculate the output bit chance from the matrices above, then we can finally
 *    got the result.
 *
 * For example:
 *    N=1, X=5, K=5, A=10, B=50, C=40, the single and total matrices (N=1) is:
 *        k = 0: [ 100 ,  0  ] , k = 1: [  10  , 90 ]
 *               [ 10  , 90  ]          [  40  , 60 ]
 *    X = 00000000000000000000000000000101
 *    K = 00000000000000000000000000000101
 *    1. when bit of X and K are both 0, the output bit is 0 by 100%.
 *    2. when bit of X and K are both 1, the output bit is 0 by 40% and 1 by 60%.
 *    So the expect value of result is (60% * 4 + 60% * 1), which is 3.
 *
 * For Improvement:
 *   The main time-consuming part of this solution is the multiplication of matrices.
 *   Some fast matrix multiplication like the Strassen-Algorithm will reduce the consumed time.
 */
public class NotSoRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();
                int X = scanner.nextInt();
                int K = scanner.nextInt();
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                int C = scanner.nextInt();
                Matrix bitZero = new Matrix(100, 0, A, B + C);
                Matrix bitOne = new Matrix(A, B + C, C, A + B);
                Matrix bitZeroAfterK = bitZero;
                Matrix bitOneAfterK = bitOne;
                for (int n = 1; n < N; n++) {   // Maybe some Fast-Matrix-Multiplication will do it faster.
                    bitZeroAfterK = multiply(bitZeroAfterK, bitZero);
                    bitOneAfterK = multiply(bitOneAfterK, bitOne);
                }
                double result = 0;
                for (int i = 31; i >= 0; i--) {
                    result *= 2;
                    Matrix matrix = isLastZero(K, i) ? bitZeroAfterK : bitOneAfterK;
                    double chanceOfOne = (isLastZero(X, i) ? matrix.b : matrix.d) / 100;
                    result += chanceOfOne;
                }
                print(t, result);
            }
        }
    }

    private static boolean isLastZero(int num, int position) {
        return (num >>> position) % 2 == 0;
    }

    private static void print(int t, double result) {
        System.out.println("Case #" + (t + 1) + ": " + result);
    }

    private static Matrix multiply(Matrix m1, Matrix m2) {
        double a = (m1.a * m2.a + m1.b * m2.c) / 100;
        double b = (m1.a * m2.b + m1.b * m2.d) / 100;
        double c = (m1.c * m2.a + m1.d * m2.c) / 100;
        double d = (m1.c * m2.b + m1.d * m2.d) / 100;
        return new Matrix(a, b, c, d);
    }

    private static class Matrix {
        private double a, b, c, d;
        public Matrix(double a, double b, double c, double d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
