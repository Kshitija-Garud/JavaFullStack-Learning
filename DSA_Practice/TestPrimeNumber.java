package com.democoing;

import java.util.Scanner;

public class TestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no:");
		int n=sc.nextInt();
		int f=1;
		if(n==1)
		{
			System.out.println(n+"is not prime");
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%2==0)
				{
					f=0;
					break;
				}
			}
			if(f==1)
			{
				System.out.println(n+"is  prime");
			}
			else
			{
			System.out.println(n+"is not prime");
		    }
		}
	}

}
