package Special.FizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {
    private int[] numbers;
    private String results;

    @BeforeEach
    void setUp() {
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        results = "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]";
    }

    @Test
    void badTest() {
        assertEquals(Arrays.toString(Bad.FizzBuzz(numbers)), results);
    }

    @Test
    void betterTest() {
        assertEquals(Arrays.toString(Better.FizzBuzz(numbers)), results);
    }

    @Test
    void bestTest() {
        assertEquals(Arrays.toString(Best.FizzBuzz(numbers)), results);
    }
}