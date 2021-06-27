package useofsuperkeyword;

class A{
	int i=10;
	int j=20;
	
}
class B extends A{
	int i=30;
	int j=40;
	
	B(int i, int j){
		System.out.println(i+"      "+j);
		System.out.println(this.i+"      "+this.j);
		System.out.println(super.i+"      "+super.j);
	}
	
}

public class InheritanceWithSuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b =new B(50,60);
	}

}
