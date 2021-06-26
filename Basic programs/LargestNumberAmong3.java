import java.util.*;
class LargestNumberAmong3
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three Number=");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("Largest No="+((a>b && a>c)?a:(b>c)?b:c));
	}
}