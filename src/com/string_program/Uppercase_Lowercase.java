package com.string_program;

import java.util.Scanner;

public class Uppercase_Lowercase 
{
  public static void main(String[] args) 
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the string");
	 String str = sc.nextLine();
	 int ucount =0;
	 int lcount =0;
	 for(int i=0; i<str.length(); i++)
	  {
		 char ch = str.charAt(i);
		 if(ch>='A' && ch<='Z')
			 ucount++;
		 else if(ch>='a' && ch<='z')
			 lcount++;
	  }
	 System.out.println("no of capital letter "+ucount);
	 System.out.println("no of small letter "+lcount);
  }
  
}
