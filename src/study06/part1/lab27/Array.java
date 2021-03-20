package study06.part1.lab27;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Array {
    public static void main(String[] args) {
        Integer[][] array = generateArray(5);
        Integer[] result = changeDimension(array);
    }

    public static Integer[][] generateArray(int dimension) {
        Integer[][] array = new Integer[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                array[i][j] = random.nextInt(89) + 10;
            }
        }

        return array;
    }

    public static Integer[] changeDimension(Integer[][] array) {
        return Stream.of(array).flatMap(Stream::of).toArray(Integer[]::new);
    }

    public static Integer middleValue(Integer[] array) {
        return Arrays.stream(array).reduce(0, (sum, next) -> sum + next) / array.length;
    }
}


