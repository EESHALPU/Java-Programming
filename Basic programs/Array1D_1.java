import java.util.*;
class Array1D_1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Size=");
		int n=s.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter the Array Element=");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0&& arr[i]%7==0)
				System.out.println(arr[i]);
		}
		
	}
}
		