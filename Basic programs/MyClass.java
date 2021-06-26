import java.util.*;
class ShowRoom
{
		int cost,discount,totalAmount;
		void getCost(int x)
		{
			cost=x;

			// Now we will calculate the discount
			if(cost<=3000)
			{
				totalAmount=cost;
				discount=0;
			}
			else if(cost>3000 && cost<=6000)
			{
				discount=(cost*10)/100;
				totalAmount=cost-discount;
			}
			
			else if(cost>6000 && cost<=10000)
			{
				discount=(cost*25)/100;
				totalAmount=cost-discount;
			}
			
			else if(cost>10000)
			{
				discount=(cost*40)/100;
				totalAmount=cost-discount;
			}
			System.out.println("Total cost	:"+cost);
			System.out.println("Discount	:"+discount);
			System.out.println("Total Pay	:"+totalAmount);
		}
		
}

class MyClass
{
		public static void main(String args[])
		{	
			int costp;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Total Cost=");
			costp=sc.nextInt();
			ShowRoom obj = new ShowRoom();
			obj.getCost(costp);
			
		}
}