package com.yash.IntermediateTddTask6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.IntermediateTddTask5.Student;
import com.yash.IntermediateTddTask6.Test1;

public class BookTest {
Test1 t=new Test1();

@Test
public void test_ShouldReturn_Book_AsOutput() 
{
	 
	int count=t.bookcount("balaguruswamy");
	assertEquals(count, 3);
	
}

}
