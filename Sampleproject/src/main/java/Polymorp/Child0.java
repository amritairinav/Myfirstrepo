package Polymorp;

public class Child0 extends Parent0{
	public void show() {
		System.out.println("This is another instance method");
		super.show();
	}
public void display(int a, int b) {
	int diff=a-b;
	System.out.println("Difference of 2 numbers:" + diff);
	super.display(200, 100);
}
	
	@Override
public void display1(int c, int d) {
	// TODO Auto-generated method stub
		//int diff=c-d;
		//System.out.println("Difference of 2 numbers:" + diff);
	super.display1(c, d);
}
	public static void main (String [] args) {
		
		Child0 obj=new Child0();
		obj.show();
		obj.display(100, 50);
		obj.display1(10, 10);
	}
}


