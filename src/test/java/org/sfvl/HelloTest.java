package org.sfvl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    public void test_hello() {
        final Hello hello = new Hello();
        System.out.println("HelloTest.test_hello");
        System.out.println("Change trace");
    }
}