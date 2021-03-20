package study06.part1.lab26;

import study06.part1.lab27.Array;

public class Test {
    public static void main(String[] args) {
        Test.testChangeDimension();
        Test.testMiddleValue();
    }

    public static void testChangeDimension() {
        int size = 3;
        Integer[][] array = new Integer[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = i * size + j;
            }
        }

        System.out.println("Run change dimension test:");

        try {
            Integer[] result = Array.changeDimension(array);

            for (int i = 0; i < size * size - 1; i++) {
                if (result[i] != i) {
                    throw new TestFallException("test fall");
                }
            }

            System.out.println("Test was ended successful\n");
        } catch (TestFallException e) {
            e.printStackTrace();
        }
    }

    public static void testMiddleValue() {
        Integer[] array = new Integer[]{3, 5, 6};
        int middleValue = (3+5+6) / 3;

        Integer result = Array.middleValue(array);

        System.out.println("Run middle value test:");
        System.out.println("Expected: " + middleValue);
        System.out.println("In fact: " + result);

        try {
            if (result != middleValue) {
                throw new TestFallException("");
            }

            System.out.println("Test was ended successful");
        } catch (TestFallException exception) {
            exception.printStackTrace();
        }
    }

}
