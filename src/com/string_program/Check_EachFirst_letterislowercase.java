package com.string_program;

import java.util.Scanner;

public class Check_EachFirst_letterislowercase 
{
   public static void main(String[] args)
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the character");
	 String str = sc.nextLine();
	 String s = initcap(str);
	 System.out.println(s);
   }

private static String initcap(String str) 
{
   char[] ch = str.toCharArray();
   for(int  i=0; i<ch.length; i++)
   {
	   if(i==0 && ch[i]!=' '|| ch[i]!=' ' && ch[i-1]==' ')
		{
		  if(ch[i]>='A' && ch[i]<='Z')
			  ch[i]=(char)(ch[i]+32);
		}
		else
		{
			if(ch[i]>='a' && ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
	}
	str = new String(ch);
	return str;
}
}
