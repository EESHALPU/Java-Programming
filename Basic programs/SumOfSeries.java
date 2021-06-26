import java.util.*;
class SumOfSeries
{
	public static void main(String args[])
	{
		int firstTerm=1, lastTerm=10;
		int count=1;
		double N,D;
		double sum=0;
		
		for(double i=1;i<lastTerm;i++)
		{
			if(count%2==0)
			{
				N=i;
				D=i+1;
				i++;
				sum=sum-(N/D);
			}
			else
			{
				N=i;
				D=i+1;
				i++;
				sum=sum+(N/D);
			}
			count++;
		}
		System.out.print("sum of series="+sum);
	}
}