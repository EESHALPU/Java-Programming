//Q2. Write a program to find the sum of the series:
//  ½ + ¾ + 5/6 + ……………………………………………………… + 9/10

import java.util.*;
class SumOfSeries4
{
	public static void main(String args[])
	{
		float N,D,sum=0;
		for(float i=0;i<10;i++)
		{
			N=i+1;
			D=N+1;
			i=D;
			sum=sum+N/D;
		}
		System.out.print("Sum of series:="+sum);
	}
}
		
