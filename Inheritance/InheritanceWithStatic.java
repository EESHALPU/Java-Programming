import java.util.*;

class A{
	static int i=m1();
	
	static int m1() {
		System.out.println("m1-A");
		return 10;
	}
	static {
		System.out.println("SB-A");
	}
}

class B extends A{
	static int m2() {
		System.out.println("m2-B");
		return 20;
	}
	
	static {
		System.out.println("SB-B");
	}
	static int j=m2();
}


class C extends B{
	static {
		System.out.println("SB-C");
	}
	
	static int k=m3();
	static int m3() {
		System.out.println("m3-C");
		return 30;
	}
}
public class InheritanceWithStatic {
	public static void main(String[] args)
	{
		C c=new C();
	}

}
