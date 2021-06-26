import java.util.*;
class Telephone
{
	int previous,present,bills;
	String name;
	double amount,totalAmount,serviceFee=150.0;
	Scanner sc=new Scanner(System.in);
	void customerDetail()
	{
		System.out.print("Enter the Customer Name=");
		name=sc.nextLine();
		
		System.out.print("Enter the Previous calls=");
		previous=sc.nextInt();
		
		
		System.out.print("Enter the Presnt calls=");
		present=sc.nextInt();
		
		
	}
	void calculateBills()
	{
		bills=previous+present;
		if(bills<=100)
		{
			amount=0;
			totalAmount=amount+serviceFee;
		}
		else if(bills>100&&bills<=200)
		{
			amount=bills*0.80;
			totalAmount=amount+serviceFee;
		}
		
		else if(bills>200&&bills<=400)
		{
				amount=bills*0.90;
				totalAmount=amount+serviceFee;
		}
		
		else if (bills>400)
		{
				amount=bills*0.60;
				totalAmount=amount+serviceFee;
		}
			
			
		
	}
	
	
	void show()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("Name\t\tCalls-Made\tAmount Total_Amount");
		System.out.println("-------------------------------------------------------------");
		//System.out.println("Name= "+name+" Calls-Made= "+bills+" Amount= "+amount+" Total Amount= "+totalAmount);
		System.out.println(name+"\t\t"+bills+"\t\t"+amount+"\t"+totalAmount);
		}
}





class TelephoneCustomerDetails
{
		public static void main(String args[])
		{
			Telephone obj=new Telephone();
			obj.customerDetail();
			obj.calculateBills();
			obj.show();
		}
}
