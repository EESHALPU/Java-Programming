class A{
{
	System.out.printfln("IB-A");
}
static{
	System.out.println("SB-A");
}

int m1(){
	System.out.println("m1-A");
	return 10;
	}
	
static int m2(){
	System.out.println("m2-A");
	return 20;
	}
int i=m1();
static int j=m2();
A(){
	System.out.println("A-Constructor");
	}
}

class StaticAndInstance
{
	public static void main (String[] args)
	{
		A a1=new A();
		A a2=new A();
	}
}