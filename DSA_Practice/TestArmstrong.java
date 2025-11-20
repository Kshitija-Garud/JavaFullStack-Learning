package com.democoing;

public class TestArmstrongSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=1000;i++)
		{
			int s=0;
			int org=i;
			
			while(org>0)
			{
				int r=org%10;
				s=s+r*r*r;
				org=org/10;
			}
			if(s==i)
			{
				System.out.println(i);
			}
		}
	}

}
