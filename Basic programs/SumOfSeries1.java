import java.util.*;
class SumOfSeries1
{
	public static void main(String args[])
	{
		int n=10;
		
		double i=0,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+1/i;
		}
		System.out.println("Sum="+sum);
	}
}