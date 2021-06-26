
import java.util.*;
class ShowRoom
{
		int cost,discount,totalAmount;
		void getCost(int x, char ch)
		{
			cost=x;
			char w = ch;
			
			if(w=='L')
			{
			// Now we will calculate the discount
			 if(cost<=5000)
			 {
				totalAmount=cost;
				discount=0;
			 }
		     
			 else if(cost>5001 && cost<=30000)
			 {
				discount=(cost*10)/100;
				totalAmount=cost-discount;
			 }
			
			 else if(cost>30001 && cost<=50000)
			 {
				discount=(cost*12)/100;
				totalAmount=cost-discount;
			 } 
			
			 else if(cost>50001 && cost<=100000)
			 {
				discount=(cost*20)/100;
				totalAmount=cost-discount;
			 }
			 System.out.println("Total cost	:"+cost);
			 System.out.println("Discount	:"+discount);
			 System.out.println("Total Pay	:"+totalAmount);
		}
			else
			{
			
				if(w=='D')
				{
				// Now we will calculate the discount
				 if(cost<=5000)
				 {
					totalAmount=cost;
					discount=0;
			     }
				 else if(cost>5001 && cost<=30000)
				 {
					discount=(cost*15)/100;
					totalAmount=cost-discount;
				 }
				
				 else if(cost>30001 && cost<=50000)
				 {
					discount=(cost*20)/100;
					totalAmount=cost-discount;
				 } 
				
				 else if(cost>50001 && cost<=100000)
				 {
					discount=(cost*25)/100;
					totalAmount=cost-discount;
				 }
				 System.out.println("Total cost	:"+cost);
				 System.out.println("Discount	:"+discount);
				 System.out.println("Total Pay	:"+totalAmount);
			
			}
		}
	}
		
		
}



class Myclass1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int costp;
		String username,address;
		char ch;
		System.out.println("Enter the customer name:");
		Scanner sc=new Scanner(System.in);
		username=sc.nextLine();
		
		System.out.println("Address: ");
		address = sc.nextLine();
		
		System.out.println("Enter the amount of purchase");
		costp= sc.nextInt();
		
		System.out.println("Enter the type of purchase (L/D) ");
		ch = sc.next().charAt(0);
		
		ch=Character.toUpperCase(ch);
		
		
		ShowRoom obj = new ShowRoom();
		obj.getCost(costp,ch);
	}
}
		
