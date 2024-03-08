package com.string_program;

import java.util.Scanner;

public class Digit_in_string 
{
	
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the strring value");
	String str = sc.nextLine();
	
	System.out.println(digit(str));
	
  }
  public static int digit(String str)
  {
	int digcount =0; 
	  for(int i=0; i<str.length(); i++)
	  {
		  char ch = str.charAt(i);
		  if(ch>='0' && ch<='9')
			  digcount++;
		 
	  }
	return digcount;
	
  }
}
