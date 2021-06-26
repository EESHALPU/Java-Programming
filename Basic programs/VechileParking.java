import java.util.*;
class Parking
{
	String vechile_no;
	int hours;
	double bill=0;
	Scanner sc=new Scanner(System.in);
	void getParkingDetail()
	{
		System.out.print("Enter the Vechile No: ");
		vechile_no=sc.nextLine();
		System.out.print("Enter the Number of hours=");
		hours=sc.nextInt();
		
		if(hours>0)
		{
			bill=10+(hours-1)*5;
		}
		System.out.println("Total Bill= RS."+bill+"/-");
	}
	
	
	
}



class VechileParking
{
	public static void main(String args[])
	{
		Parking obj=new Parking();
		obj.getParkingDetail();
	}
}
		