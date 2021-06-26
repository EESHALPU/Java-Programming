import java.util.*;

class A{
	void m1(){
		System.out.println("m1-A");
	}
	
}

class B extends A{
	void m2(){
		System.out.println("m2-B");
	}
	
}

class SingleInheritance{
	public static void main(String args[])
	{	
		B b=new B();
		b.m1();
		b.m2();
		A a=new A();
		a.m1();
		//a.m2();
	}
}
