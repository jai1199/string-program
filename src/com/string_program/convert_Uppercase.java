package com.string_program;

import java.util.Scanner;

public class convert_Uppercase 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.nextLine();
	String upp=toupper(str);
	System.out.println(upp);
  }

public static String toupper(String str)
{
	char[]ch = str.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]>='a' && ch[i]<='z')
			ch[i] = (char)(ch[i]-32);//narrowing
	}
	str = new String(ch);
	
	return str;
}
}
