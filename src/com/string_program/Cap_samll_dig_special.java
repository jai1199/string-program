package com.string_program;

import java.util.Scanner;

public class Cap_samll_dig_special 
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the character ");
	String str = sc.nextLine();
	int capl=0, small=0, dig=0, spcl=0;
	for(int i=0; i<str.length(); i++)
	{
		char ch = str.charAt(i);
		if(ch >='A' && ch<='Z')
			capl++; 
		else if(ch>='a' && ch<='z')
			small++;
		else if(ch>='0' && ch<='9')
			dig++;
		else
			spcl++;
	}
	System.out.println("no of capital letter= "+capl);
	System.out.println("no of small letter="+small);
	System.out.println("no of digit present in character="+dig);
	System.out.println("no of special charcter present in string="+spcl);
  }
}
