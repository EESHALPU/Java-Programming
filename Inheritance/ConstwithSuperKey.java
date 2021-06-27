package constwithsuperkey;
import java.util.*;

import java.util.Scanner;

class A{
	A(){
		System.out.println("A-con");
	}
	A(int i)
	{
		System.out.println("A-int-param-Con");
	}
}


class B extends A{
	B()
	{
		super(10);
		System.out.println("B-con");
	}
}

public class ConstwithSuperKey {

	public static void main(String[] args) {
		System.out.println("Enter the Number for J value: ");
		Scanner sc= new Scanner(System.in);
		int j=sc.nextInt();
		System.out.println("The value for J is :"+j);
		B b=new B();

	}

}
