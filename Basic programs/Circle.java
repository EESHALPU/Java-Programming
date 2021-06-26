import java.util.*;
class AreaOfCircle
{
	float radius;
	void getData()
	{
		//Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle=:");
		radius=10;//s.nextInt();
			
	}

	void calculate()
	{	double area,perimeter;	
		area=3.14*radius*radius;
		perimeter=2*(3.14*radius);
		System.out.println("Area of circle=:"+area);
		
		System.out.println("Perimeter of circle=:"+perimeter);
	}
}

class Circle
{
	public static void main(String args[])
	{
			AreaOfCircle obj;
			obj.getData();
			obj.calculate();
	}
}