import java.util.*;
class Newspaper
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int demandNewpaper;
		System.out.print("Enter the Purchased Newpaper No=");
		demandNewpaper=s.nextInt();
		double costPrice=demandNewpaper*1.50;

		double temp=demandNewpaper;
		double salePrice=0;
		int soldNewsP;
		while(temp!=0)
		{
			System.out.print("Enter the No of Newpaper which is sold by before 3PM=");
   
			soldNewsP=s.nextInt();
			salePrice=soldNewsP*2.00;
			temp=temp-soldNewsP;

			//unsold paper will sold at .50paise

			salePrice=salePrice+(temp*0.50);
			temp=temp-temp;

		}

		if(costPrice<salePrice)
			{
				 double profit=salePrice-costPrice;
				System.out.println("Profit="+profit);
			}
		else
			{
				double loss=costPrice-salePrice;
				System.out.println("Loss="+loss);
			}
	}
}
