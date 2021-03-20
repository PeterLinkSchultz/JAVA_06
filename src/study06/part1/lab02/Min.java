package study06.part1.lab02;

public class Min {
    static int run(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
