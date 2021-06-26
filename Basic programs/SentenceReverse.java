import java.util.*;
class SentenceReverse
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the text=");
		String word=s.nextLine();
		String reverse=" ";
		s.close();
		String[] arr = word.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			reverse=reverse+arr[i]+" ";
			
		}
		
		System.out.println("Reverse of Sequence="+reverse);

	}
}