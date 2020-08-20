import java.util.*;
class PrintAllPrime
{
    public static void main( String args[])
    {
	Scanner s=new Scanner(System.in);
	int num,num1;
	System.out.println("Enter range of number-");
	System.out.print("FirstNum=");
	num=s.nextInt();

	System.out.print("SecondNum=");
	num1=s.nextInt();
	int count=0;
	System.out.println("Prime number are=");

	for(int j=num; j<=num1; j++)
	{
	     	for(int i=2;i<=j/2;i++)
		 {
			if(j%i==0)
			count++;
		}
	        if(count==0)
	         {
		System.out.print(j+" ");
	          }
	count=0;
                    }
         }
}

	
      