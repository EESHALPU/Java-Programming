import java.util.*;
class CountArgument
{
	public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Text=");
		String st=s.nextLine();
		
		
		int n_char=st.length();
		int n_arg=args.length;
	
	System.out.println("Number of char="+n_char);
	System.out.println("Number of Argument="+n_arg);
	}

}
