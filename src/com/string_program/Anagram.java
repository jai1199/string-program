package com.string_program;

import java.util.Arrays;

public class Anagram 
{
  public static void main(String[] args) 
  {
	String a = "listen";
	String b = "SILENT";// if u pass in smalll letter then its gives true
	char[] ch = a.toCharArray();
	char[]th = b.toCharArray();
	Arrays.sort(ch);
	Arrays.sort(th);
	boolean result = Arrays.equals(ch, th);
	if(result == true)
	{
		System.out.println(" this string is anagram");
	}
	else
	{
		System.out.println("this string is not a anagram");
	}
  }
}
