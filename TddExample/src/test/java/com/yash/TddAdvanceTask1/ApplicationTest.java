package com.yash.TddAdvanceTask1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TddAdvanceTask1.Application;
import com.yash.TddAdvanceTask1.ApplicationService;

public class ApplicationTest {
	ApplicationService ast=new ApplicationService();
	
	@Test
	public void test_application_return_maessagewithdeatils()
	{
		Application app1=new Application(101,"aaa");
		Application a=ast.addApplication(app1);
		assertEquals("Application sucessfully created" +a,"Application sucessfully created" +app1);
	}

}
