package com.string_program;

import java.util.Scanner;

public class Palindrom_string 
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.nextLine();
	boolean rs = ispalindrom(str);
	if(rs)
		System.out.println("palindrom sting");
	else
		System.out.println("not a palindrom");
  } 
  public static boolean ispalindrom(String s)
  { 
	  int f =0, l=s.length()-1;
	 while(f<l)
	  {
		if(s.charAt(f)!= s.charAt(l))
		return false;
		f++;
		l--;
	  }
	return true;
	  
  }
}
