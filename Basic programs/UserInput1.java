import java.util.*;
class UserInput1             // take integer number from the user using Scanner class 
{                    
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First No=");
		
		int firstNum=s.nextInt();
		System.out.print("Enter Second No=");
		
		int secondNum=s.nextInt();
		int sum=firstNum+secondNum;
		
		System.out.println("firstNum"+"secondNum"+"="+sum);
	}
}