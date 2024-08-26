package org.junit.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.services.CalculatorServices;

public class CalculatorServiceJUnit5Test {

    @BeforeAll
    public static void init(){
        System.out.println("This is Single TIme Logic");
    }


    @Test
    public void addTwoNumberTest() {
        int Result = CalculatorServices.addTwoNumber(12, 12);
        int exp = 24;
        Assertions.assertEquals(exp, Result, "Test Fail");
    }

    @Test
    public void addAnyNumberTest() {
        int res = CalculatorServices.sumTwoNumber(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int ex = 45;
        Assertions.assertEquals(res, ex, "Test Case Failed");
    }

        @AfterAll
        public static void cleanup(){
            System.out.println("End Task");
        }
}
