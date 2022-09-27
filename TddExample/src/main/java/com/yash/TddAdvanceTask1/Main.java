package com.yash.TddAdvanceTask1;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationService as=new ApplicationService();
		Application app1=new Application(101,"aaa");
		Application a=as.addApplication(app1);
		
	}

}
