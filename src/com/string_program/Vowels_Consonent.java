package com.string_program;

import java.util.Scanner;

public class Vowels_Consonent 
{
   public static void main(String[] args)
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("emter the string");
	 String str = sc.nextLine();
	 int vowel=0,consonent=0;
	 for(int i =0; i<str.length(); i++)
	 {
		 char ch = str.charAt(i);
		 if(ch>='A' && ch<='Z')
		 {
		     if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
			 vowel++;
		     else
		    	 consonent++;
		 }
		 else if(ch>='a' && ch<='z') 
		     {
		    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    		 vowel++;
		    	 else
		    		 consonent++;
		    		
	           }
	 }
	 System.out.println("no of vowel= "+vowel);
	 System.out.println("no of consonent= "+consonent);
   }
}
