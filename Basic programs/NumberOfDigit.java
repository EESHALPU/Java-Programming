import java.util.*;
class NumberOfDigit
{
    public static void main(String args[])
     {
	Scanner s=new Scanner (System.in);
	System.out.print("Enter Number=");
	int num=s.nextInt();
	int count=0;
	
	while(num!=0)
	{
		num=num/10;
		count++;
	
	}
	
	System.out.println("Number of Digit="+count);
       }

}