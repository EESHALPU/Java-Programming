import java.util.*;
class Newspaper
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int demandNewpaper;
		System.out.print("Enter the Purchased Newpaper No=");
		demandNewpaper=s.nextInt();
		int costPrice=demandNewpaper*1.50;

		temp=demandNewpaper;
		int salePrice=0;
		while(temp!=0)
		{
			System.out.print("Enter the No of Newpaper which is sold by before 3PM");
   
			soldNewsp=s.nextInt();
			salePrice=soldNewsP*2.00;
			temp=temp-soldNewsp;

			//unsold paper will sold at .50paise

			salePrice=salePrice+temp*0.50;
			temp=temp-temp;

		}

		if(costPrice<salePrice)
			{
				System.out.println("Profit="+(salePrice-costPrice));
			}
		else
			{
				System.out.println("Loss="+(costPrice-salePrice));
			}
	}
}
