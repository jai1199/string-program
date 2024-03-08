package com.string_program;

import java.util.Arrays;
import java.util.Scanner;

public class Second_way_of_Anagram 
{
 public static void main(String[] args) 
 {
   Scanner sc = new Scanner(System .in);
   System.out.println("enter the string");
   String str1 = sc.nextLine();
   System.out.println("enter second string");
   String str2 = sc.nextLine();
   boolean result = isanagram(str1,str2);
   System.out.println(result);
 }

private static boolean isanagram(String str1, String str2) 
{
	str1 = str1.replaceAll(" "," ");
	str2 = str2.replaceAll("", "");
	if(str1.length() != str2.length())
		return false;
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
	
	char[]ch = str1.toCharArray();
	char[]th = str2.toCharArray();
	Arrays.sort(ch);
	Arrays.sort(th);
	//boolean result = Arrays.equals(ch, th);
	str1 = new String(ch);
	str2 = new String (th);
	return str1.equals(str2);
	
		
	
}
  
}
