package com.yash.IntermediateTddTask2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.BasicTddTask2.FactorialNumber;

public class FactorialNoTest {
	
	
	FactorialNumber f = new FactorialNumber();
	@Test
	public void test_Factorial_ShouldReturn_FactorialOfNumber_AsLong() 
	{
		long result=f.factorial();
		assertEquals(result, 720);
		
	}

}
