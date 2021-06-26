import java.util.*;
class LargestSmallest
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Array Element=");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter "+n+" Elements=");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int big=0,small=arr[0];
		System.out.println("Array Elements are=");
		for(int i=0;i<n;i++)
		{
			if(arr[i]>big)
				big=arr[i];
			
			if(arr[i]<small)
				small=arr[i];
		}
		System.out.print("Largest No="+big+" Smallest No="+small);
	}
}
			