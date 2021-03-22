package study06.part1.lab02;

public class Min {
    public static int run(int a, int b, int c) {
        if (a <= b && a <=c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
