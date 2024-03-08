package com.string_program;

import java.util.Scanner;

public class Upper_Lower_case 
{
  public static void main(String[] args)  
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the character");
	String str = sc.nextLine();
	String uplo = uperlower(str);
	System.out.println(uplo);
  }

private static String uperlower(String s) 
{
	char ch[] = s.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]>='a' && ch[i]<='z' )
			ch[i]=(char)(ch[i]-32);
			else if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
	 
	}
	s= new String(ch);
	return s;
}
}
