package com.yash.BasicTddTask1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.BasicTddTask1.ConsecutiveNumbers;

public class ConsecutiveNoTest {
	
	
ConsecutiveNumbers sut= new ConsecutiveNumbers();
    
    @Test
    public void consecutiveNumsSumTest01() {
    
        assertEquals(55, sut.consecutiveNumsSum(10));
    }
    
   

	@Test
    public void consecutiveNumsSumTest02() {
    
        assertEquals(0, sut.consecutiveNumsSum(0));
    }
    
    
    @Test
    public void consecutiveNumsSumTest03() {
    
        assertEquals(45, sut.consecutiveNumsSum(9));
    }
    
}
