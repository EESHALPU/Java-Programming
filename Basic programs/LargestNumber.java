import java.util.*;
class LargestNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value for a=");
		int a=s.nextInt();
		System.out.print("Enter the value for b=");
		int b=s.nextInt();
		System.out.print("Enter the value for c=");
		int c=s.nextInt();

		if(a > b && a>c)
       		{
            			System.out.println("Largest number is:"+a);
    	   	}
      		 else if(b > c)
       		 {
        		 	   System.out.println("Largest number is:"+b);
        		 }
       		 else
       		 {
         			   System.out.println("Largest number is:"+c);
        		}
	}
}