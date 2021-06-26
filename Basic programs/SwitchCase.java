import java.util.*;
class SwitchCase
{
	public  static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	char a=s.next().charAt(0);
		switch(a)
		{	
			case 'A':
			System.out.println("65");
			break;

			case 'B':
			System.out.println("66");
			break;
			
			default:
			System.out.println("Not in range");
			break;
		}
	}
}
