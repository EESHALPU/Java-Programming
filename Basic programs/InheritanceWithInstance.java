import java.util.*;

class A
{
	A()
	{
		System.out.println("A-Con");
	}
	
	int i=m1();
	int m1()
	{
		System.out.println("m1-A");
		return 10;
	}
	
	{
		System.out.println("IB-A");
	}
	
}

class B extends A {

	{
		System.out.println("IB-B");
	}
	
	int m2(){
		System.out.println("m2-B");
		return 20;
	}
	
	int j=m2();
	
	B(){
		System.out.println("IB-B");
	}
	
}


class C extends B {
	int k=m3();
	int m3(){
		System.out.println("m3-C");
		return 30;
	}
	
	C(){
		System.out.println("C-con");
	}
	
	{
		System.out.println("IB-C");
	}
	

}
class InheritanceWithInstance
{	
	public static void main(String[] args)
	{
		C c=new C();
		
	}
}