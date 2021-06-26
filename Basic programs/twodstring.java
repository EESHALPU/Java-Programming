import java.util.*;
class twodstring
{
	public static void main(String args[])
	{
		System.out.println("ENter the size of the array : ");
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the number of rows : ");
		int r = s.nextInt();
		System.out.println("ENter the number of columns : ");
		int c=s.nextInt();
		
		System.out.println("Enter the values in the array: ");
		String arr[][]= new String[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.next();
			}
		}
		
		
		
		System.out.print("Elements in the array :\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int strLength;
		int smallestStr=arr[0][0].length();
		
		System.out.print("\nLength in the array :\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				strLength=arr[i][j].length();
				if(strLength<smallestStr)
				{
					smallestStr=strLength;
				}
				
			}
			System.out.println( );
		}

		
				System.out.println("Size of small String="+smallestStr);
	}
}