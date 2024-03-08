package com.string_program;

import java.util.Scanner;

public class Reverse_string 
{
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the string value");
	 String str = sc.nextLine();
	System.out.println( rev(str));
	//String reverse = rev(str);//( using method we can do like this also) 
	//System.out.println(reverse);
//	 char[] ch = str.toCharArray();
//	   for(int i=ch.length-1; i<=0; i--)
//	   {
//		   System.out.println(ch[i]);
//	   }
//	   System.out.println();
   }
   public static String rev(String s)
   {
	   String rs="";
	   for(int i=s.length()-1; i>=0; i--)
	   {
		   rs=rs+s.charAt(i);
	   }
	   
	return rs;
   }
}
