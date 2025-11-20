package com.democoing;

import java.util.Scanner;

public class TestArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no:");
		int n=sc.nextInt();
		int org=n,r,s=0;
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if(s==org)
		{
			System.out.println(org +" is  armstrong no");
		}
		else
		{
			System.out.println(org+" is not armstrong no");
		}
		
	}

}
