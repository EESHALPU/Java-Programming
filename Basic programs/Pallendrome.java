import java.util.*;
class Pallendrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n=s.nextInt();
		int reverse=0;
		int temp=n;
		int r;
		
		while(temp!=0)
		{
			r=temp%10;
			reverse=reverse*10+r;
			temp=temp/10;
		}

		if(n==reverse)
		System.out.println("Pallendrome");
		else
		System.out.println("Not Pallendrome");
	}
}
