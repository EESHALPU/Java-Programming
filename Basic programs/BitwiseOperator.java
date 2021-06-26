import java.util.*;
class BitwiseOperator
{
	public static void main(String args[])
	{
		int a=25;	// 1 1 0 0 1
		int b=15;	// 0 1 1 1 1
	
		int c=a|b; 
		System.out.println("\nusing Bitwise OR C= "+c);   //bitwise or= 1 1 1 1 1   =(31)
		
		c=a&b; 
		System.out.print("using Bitwise AND C= "+c);   //bitwise and= 0 1 0 0 1   =(9)
		
	}
}