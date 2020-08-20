import java.util.*;
class SmallestNumber          
{                    
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First No=");
		
		int firstNum=s.nextInt();
		System.out.print("Enter Second No=");
		
		int secondNum=s.nextInt();
		
		System.out.println("Enter Third Number=");
		int thirdNum=s.nextInt();
		
		if(firstNum<secondNum)
		{
			if(firstNum<thirdNum)
			{
				System.out.println(firstNum+"is smallest Number");
			}
		}
		else if(secondNum<thirdNum)
		{
			System.out.println(secondNum+"is smallest Number");
		}
		else
		{
			System.out.println(thirdNum+"is smallest Number");
		}
				
	}
}