package com.yash.IntermediateTddTask7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.IntermediateTddTask7.AppTest;

public class EmployeeCountTest {

	AppTest app=new AppTest();
	
	
	@Test
	public void test_countemployee_return_count_asoutput()
	{
		int countemp=app.countemployee();
		assertEquals(countemp,5);
	}
	
}
