import java.util.*;
class StudentResult
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int stuMark[]=new int[5];
		
		
		
		int phy,chem,math;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Mark of Student "+(i+1)+" :-");
			System.out.print("Enter the Mark of Physics:");
			phy=s.nextInt();
			System.out.print("Enter the Mark of Chemistry:");
			chem=s.nextInt();
			System.out.print("Enter the Mark of Maths:");
			math=s.nextInt();
			stuMark[i]=phy+chem+math;
		}	
		
		System.out.println("------------------------------------------------------------------");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("% Mark of Student:"+(i+1)+" :"+ stuMark[i]/3+"%");
		}	
		
	}
	
}
		
			
			