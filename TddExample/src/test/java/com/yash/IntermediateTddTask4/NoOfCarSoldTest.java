package com.yash.IntermediateTddTask4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.IntermediateTddTask4.CarShopApp;

public class NoOfCarSoldTest {
	CarShopApp capp=new CarShopApp();
	
	@Test
	public void test_ShouldReturn_Book_AsOutput() 
	{
		 
		int count=capp.NoofCarSold();
		assertEquals(count, 7);
		
	}

}
