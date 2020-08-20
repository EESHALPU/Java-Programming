import java.util.*;
class UserInput2     // take String from the user using Scanner class 
{
	public  static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your name =");
		String name=s.nextLine();
		
		System.out.println("Your Entered ="+name);
	}
}