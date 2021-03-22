package test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import study06.part1.lab02.Min;

import static org.junit.jupiter.api.Assertions.*;

class MinTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void run() {
        assertAll("Test min",
                () -> assertEquals(3, Min.run(3, 10, 12)),
                () -> assertEquals(1, Min.run(1, 2, 1))
        );
    }
}