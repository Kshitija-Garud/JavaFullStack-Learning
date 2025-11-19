package com.democoing;

import java.util.Scanner;

public class TestPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter base:");
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
       System.out.println("Enter Quetiont:");
       int q=sc.nextInt();
       int r=1;
       for(int i=1;i<=q;i++)
       {
    	   r=r*b;
       }
       System.out.println("Power is:"+r);

	}

}
