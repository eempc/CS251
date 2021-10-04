package com.meow.tests;


import com.meow.miau.Helpers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CatTest {
    @Test
    public void factorialTest() {
        int x = Helpers.factorial(5);
        int expected = 120;
        assertEquals(x, expected);

        int y = Helpers.factorialWithMin(10, 8);
        int expectedY = 720;
        assertEquals(y, expectedY);
    }

    @Test
    public void factorialTest2() {
        int x = Helpers.factorial(5);
        int expected = 5;
        assertNotEquals(x, expected);

        int y = Helpers.factorialWithMin(10, 8);
        int expectedY = 2;
        assertNotEquals(y, expectedY);
    }
}
