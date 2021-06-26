import java.util.*;
class CountCons
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Sentence=");
		String sentence=s.nextLine();
		//String sentence="i am good boy";
		
		int countC=0,countSpace=0,countV=0;
		sentence=sentence.toLowerCase();
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||
			sentence.charAt(i)=='o'||sentence.charAt(i)=='u')
			{
				countV++;
			}
			
			else if(sentence.charAt(i)>='a'&&sentence.charAt(i)<='z')
			{
				countC++;
			}
			
			if(sentence.charAt(i)==' ')
			{
				countSpace++;
			}
			
		}
		
		
		String inLower=sentence.toLowerCase();
		String inUpper=sentence.toUpperCase();
		
		
			System.out.println("No of Consonat=: "+countC+" No of Vowel=: "+countV +" No of Space=: "+countSpace);
			
			System.out.println("Lowercase: ="+inLower+" \nUpperCase=: "+inUpper);
		
	}
}