package com.string_program;

public class InsertElementAtSpecific {
	public int [] insert(int a[],int ele,int in) {
		int b[]=new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			if(i==in) {
				b[i]=ele;
			}
			if(i<in) {
				b[i]=a[i];
			}
			else
				b[i+1]=a[i];
		}
		return b;
	}
public static void main(String[] args) {
	InsertElementAtSpecific i=new InsertElementAtSpecific();
	int a[]= {3,2,4,2,4,6};
	int b[]=i.insert(a, 23, 3);
	for(int c:b) {
		System.out.println(c+" ");
	}
}
}
