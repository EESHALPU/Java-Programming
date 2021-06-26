import java.util.*;
class Test1         //display all character in reverse order
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String=");
		
		String st=s.nextLine();
		String reverse=" ";		
		
		for(int i=st.length()-1;i>=0;i--)
		{
			reverse=reverse+st.charAt(i);
		}
		
		System.out.println("Reverse of String="+reverse);
		
	}
}