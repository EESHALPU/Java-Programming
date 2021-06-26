import java.util.*;
class UpperLowerCase             // Convert lowercase into upper case using Ascii value 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Sentence=");
		String sentence=s.nextLine();
		
		sentence=sentence.toLowerCase();
		char ch;
		int temp;
		char inUpper[]=new char[sentence.length()];
		char inLower[]=new char[sentence.length()];
		int countC=0,countV=0,countSpace=0;
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
		
		System.out.println("Number Vowel="+countV+"\nNumber of Consonant="+countC+"\nNumber of Space="+countSpace);
		
		System.out.println("Sentence in Upper Case:-");
		for(int i=0;i<sentence.length();i++)
		{
				ch=sentence.charAt(i);
				temp=(int)ch;
				temp=temp-32;
				inUpper[i]=(char)temp;
			
			System.out.print(inUpper[i]);
		}
		
		System.out.println("");
		
		System.out.println("Sentence in Lower Case:-");
		
			for(int i=0;i<sentence.length();i++)
		{
				ch=inUpper[i];
				temp=(int)ch;
				temp=temp+32;
				inLower[i]=(char)temp;
			System.out.print(inLower[i]);
			
		}
			
		
		
	}
}