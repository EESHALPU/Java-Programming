class Outer
{
	int n;
	void getNum(int a)
	{
		n=a;
	}         
	
	void show()
	{
		System.out.println("Number="+n);
	}
}

	class Inner extends Outer
		{
			int b=20;
			Outer obj_outer=new Outer();
			getNum(b);
		}


class Test
{
	public static void main(String args[])
	{
		Outer obj=new Outer();
		//Outer.Inner obj_inner=new Outer.Inner();
		obj.show();
		//obj_inner.show();
	}
}