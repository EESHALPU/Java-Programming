import java.util.*;
class Rectangle
{
	int length,breath,area;
	Scanner sc=new Scanner(System.in);
	Rectangle()
	{
		System.out.print("Enter the Length and Breath of Rectangle=");
		length=sc.nextInt();
		breath=sc.nextInt();
		area=length*breath;
		System.out.println("Area of Rectangle="+area);
	}
}

class Square extends Rectangle
{
	int side=length,areaSquare;
	Square()
	{
		//System.out.print("Enter the Side of Square=");
		//side=sc.nextInt();
		areaSquare=side*side;
		System.out.println("Area of Side="+areaSquare);
	}

}




class Area
{
	public static void main(String args[])
	{
		
		Square sq=new Square();
		
		
		
	}
	
}
