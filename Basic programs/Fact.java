import java.util.*;
class Fact   
{                    
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter No=");
		
		int num=s.nextInt();
		int factorial=1;
		
		while(num!=0)
		{
			factorial=factorial*num;
			num--;
		}
		System.out.print("factorial="+factorial);
		
	}
}