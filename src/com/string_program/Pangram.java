package com.string_program;

import java.util.Scanner;

public class Pangram 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.nextLine();
	boolean rs = ispangram(str);
	System.out.println(rs);
  }

private static boolean ispangram(String str) 
{
	if(str.length()<26)
		return false;
	int[]count = new int[26];
	for(int i=0; i<str.length(); i++)
	{
		char ch = str.charAt(i);
		if(ch>='a' && ch<='z')
			count[ch-97]++;
		else if(ch>='A' && ch<='Z')
			count[ch-65]++;
	}
	for(int i=0; i<26; i++)
	{
		if(count[i]==0)
			return false;
	}
		return true;
	
	
	
}
}
