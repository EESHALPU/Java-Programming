import java.util.*;
class Array1D
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Array Element=");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter "+n+"Element=");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array Elements are=");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
			