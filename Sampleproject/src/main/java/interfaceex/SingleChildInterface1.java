package interfaceex;

public class SingleChildInterface1 implements MultipleParent1,MultipleParent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MultipleParent1 obj=new SingleChildInterface1();--->Either we can do bu=y creating reference of parent interface
		 *  or creating child class objects
		obj.sum();
		MultipleParent2 obj1=new SingleChildInterface1();
		obj1.diff();*/
		SingleChildInterface1 obj=new SingleChildInterface1();
		obj.diff();
		obj.sum();
	}
		

	@Override
	public void diff() {
		int a=100;
		int b=200;
		int c=b-a;
		System.out.println("Difference of 2 numbers" + c);
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int c=b+a;
		System.out.println("Sum of 2 numbers" + c);
	}

}
