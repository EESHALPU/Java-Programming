import java.util.*;
class Employee
{
	String name;
	String dep;
	String empId;
	double bsal;
	Scanner sc=new Scanner(System.in);
	void getEmployeeDetail()
	{
		System.out.print("Enter the Name=");
		name=sc.nextLine();
		
		System.out.print("Enter the Department=");
		dep=sc.nextLine();
		
		System.out.print("Enter the Employee Id=");
		empId=sc.nextLine();
		
		System.out.print("Enter Basic Salary=");
		bsal=sc.nextInt();
		
	}
}
class Salary extends Employee
{

	void calculateSal(){
	double da,hra,fund,gSal;
	da=(bsal*21)/100;
	hra=(bsal*12)/100;
	fund=(bsal*6.45)/100;
	gSal=(bsal+da+hra)-fund;
	System.out.println("Gross Sal="+gSal);
  }
}



class EmployeeSalary
{
	public static void main(String args[])
	{
		Salary emp=new Salary();
		emp.getEmployeeDetail();
		emp.calculateSal();
	}
}
