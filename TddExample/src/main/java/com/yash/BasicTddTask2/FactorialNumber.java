package com.yash.BasicTddTask2;

import java.util.Scanner;

public class FactorialNumber {
	public long factorial() {
		long fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		while(n>0)
		{
			fact=fact*n;
			n=n-1;
		}
		System.out.println("factorial is "+fact);
		return fact;
	}
public static void main(String[] args) {
	FactorialNumber fn=new FactorialNumber();
	long fact=fn.factorial();
	System.out.println(fact);
}
}
