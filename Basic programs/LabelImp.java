import java.util.*;
class LabelImp
{
	public static void main(String  args[])
	{
	outer: for(int i=0;i<5;i++)
			{
				for(int  j=10;j<15;j++)
				{
					if(i==4)
					goto outer;
					else
					System.out.print(j+" ");
				}
			}