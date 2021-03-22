package test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import study06.part1.lab27.Array;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    @DisplayName("Change dimension test")
    public void testChangeDimension() throws Exception {
        int size = 3;
        Integer[][] array = new Integer[size][size];
        Integer[] expectedArray = new Integer[size*size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = i * size + j;
                expectedArray[i * size + j] = i * size + j;
            }
        }

        Integer[] result = Array.changeDimension(array);

        assertAll("Size and values",
                () -> assertEquals(size*size, result.length),
                () -> assertArrayEquals(expectedArray, result));

    }

    @Test
    @DisplayName("Middle value test")
    void middleValue() {
        Integer[] array = new Integer[]{Integer.MAX_VALUE - 1, Integer.MAX_VALUE, 6};

        System.out.println(Integer.MAX_VALUE);
        Double expectedMiddleValue = 1431655766.0;

        assertAll("Middle value for values around MAX_VALUE",
                () -> assertEquals(Math.floor(expectedMiddleValue), Math.floor(Array.middleValue(array))));
    }
}