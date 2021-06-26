import java.util.*;
class CountLowerCase
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Sentence=");
		String sentence=s.nextLine();
		
		int countLcase=0;
		
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)>=97&& sentence.charAt(i)<=122)
				countLcase++;
			
		}
		System.out.println("Lower case char=:"+countLcase);
		
	}
}