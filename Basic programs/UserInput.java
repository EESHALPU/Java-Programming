class UserInput
{
	public static void main(String args[])
	{
		int n=args.length;
		if(n==0)
		{
			System.out.println("No Argument passed");
		}
		
		else
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(args[i]);
			}
		}
	}
}