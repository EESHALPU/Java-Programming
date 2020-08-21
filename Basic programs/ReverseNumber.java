import java.util.*;
class ReverseNumber
{
    public static void main(String args[])
     {
	Scanner s=new Scanner (System.in);
	System.out.print("Enter Number=");
	int num=s.nextInt();
	int reverse=0;
	int rem;
	
	while(num!=0)
	{
		rem=num%10;
		num=num/10;
		reverse=reverse*10+rem;
	}
	
	System.out.println("Reverse of Number="+reverse);
       }

}