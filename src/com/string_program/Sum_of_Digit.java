package com.string_program;

import java.util.Scanner;

public class Sum_of_Digit 
{
  public static void main(String[] args) 
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the string");
	 String str = sc.nextLine();
	 int sum = sumofdigits(str);
	 System.out.println("sum of digit "+sum);
  }

private static int sumofdigits(String str) 
{
	int sum=0;
	for(int i=0; i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(ch>='0' && ch<='9')
			sum=sum+ch-48;
	}
	
	return sum;
}
}
