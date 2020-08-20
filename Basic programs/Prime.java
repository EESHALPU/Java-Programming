import java.util.*;
class Prime 
{                    
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter No=");
		
		int num=s.nextInt();
		int count=0;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
	
		if(count==0)
		{
			System.out.print("Number is Prime");
		}
		else
		{
			System.out.print("Number is Not Prime");
		}
	}
}