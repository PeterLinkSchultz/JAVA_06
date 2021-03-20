package study06.part1.lab01;

public class Swap {
    static boolean run(int i, int j, int[] anArray) {
        int maxRange = anArray.length - 1;

        if (i > maxRange || i < 0 || j > maxRange || j < 0) {
            return false;
        }

        int temp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = temp;

        return true;
    }
}
