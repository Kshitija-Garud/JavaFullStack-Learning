package com.democoing;

public class TestPrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=2;i<=100;i++)
	{
		int f=1;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				f=0;
				break;
			}
			
		}
		if(f==1)
		{
			System.out.println(i);
		}
		
	}
	}

}
