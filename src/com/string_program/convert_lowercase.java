package com.string_program;

import java.util.Scanner;

public class convert_lowercase 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.nextLine();
	String uslc = upperlower(str);
	System.out.println(uslc);
  }

public static String upperlower(String str) 
{
	char[]ch = str.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]>='A' && ch[i]<='Z')
			ch[i] = (char) (ch[i]+32);
		str = new String(ch);
	}
	
	return str;
    
    
}
}
