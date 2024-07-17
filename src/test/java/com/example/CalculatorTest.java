package com.example;

import org.junit.jupiter.api.*;
public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void setupAll() {
        System.out.println("Setup for all tests");
    }
    @BeforeEach
    void setup() {
        calculator = new Calculator();
        System.out.println("Setup for each test");
    }

        @Test
        void addTest() {
            System.out.println("Testing addition");
            // Test logic here
            Assertions.assertEquals(60, calculator.add(10, 50));
        }

        @Test
        void addSubtract() {
            System.out.println("Testing subtraction");
            Assertions.assertEquals(-40, calculator.subtract(10,50));
        }

        @AfterEach
        void teardown() {
           calculator = null;
            System.out.println("Teardown after each test");
        }

        @AfterAll
        static void teardownAll() {
            // Code to clean up resources after all tests
            System.out.println("Teardown after all tests");
        }




}
