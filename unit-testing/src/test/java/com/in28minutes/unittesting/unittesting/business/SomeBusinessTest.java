package com.in28minutes.unittesting.unittesting.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessTest {

    @Test
    public void calculateSum_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {1, 2, 7});
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_empty(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] { });
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_one(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] { 7 });
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }
}