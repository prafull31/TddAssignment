package com.yash.BasicTddTask1;

public class ConsecutiveNumbers {
	
	public int consecutiveNumsSum(int n)
    {
       int sum=0;
       for(int i=1;i<=n;i++)
       {
        sum=sum+i;
       }
       return sum;
        }  
	
	public static void main(String[] args) {
		ConsecutiveNumbers con=new ConsecutiveNumbers();
		
		int s=con.consecutiveNumsSum(10);
		System.out.println(s);
		
	}
}
