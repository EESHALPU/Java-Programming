import java.util.*;
class SwitchCaseConcept
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number range[1-5]=");
		int n=s.nextInt();
		
		switch(n)
		{
			case 1:
			System.out.println("First");
			break;

			case 2:
			System.out.println("Second");
			break;

			case 3:
			System.out.println("Third");
			break;

			case 4:
			System.out.println("Fourth");
			break;
			
			case 5:
			System.out.println("Fifth");
			break;
			
			default:
			System.out.println("Not in Range");
			break;
		}
	}
}
			