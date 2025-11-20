package com.democoing;

import java.util.Scanner;

public class TestReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,r;
		while(n>0)
		{
			 r=n%10; 
			 rev=rev*10+r;
			 n=n/10;
		}
		System.out.println("reverse:"+rev);
	}

}
