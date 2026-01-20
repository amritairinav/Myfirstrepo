package abstractex;

public class ChildAbs extends ParentAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbs obj=new ChildAbs();//this is adefault c
		System.out.println("Sum of 2 numbers:"+ obj.display());
        obj.show(2.5f, 12.5f);
        obj.multiply(1, 2);
        obj.division(10.5f,12.2f);
        //Reference creation
        
        ParentAbs obj1=new ChildAbs();
        System.out.println("Sum of 2 numbers:"+ obj.display());
        obj1.show(3.9f, 6.7f);
        obj1.multiply(2, 2);
        //obj1.division(10.5f,12.f);---this is child class method and 
        //we cannot access using  parent class object or parent class reference
        obj.division(11.4f,10.8f);// child object itself needs to be created
        
           	}

	@Override
	public int display() {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int c=a+b;
		return c;
	}

	@Override
	public void show(float a, float b) {
		// TODO Auto-generated method stub
		float total= a+ b;
		System.out.println("Sum of 2 numbers:"+ total);
		
	}
	//creating method in child class
	public void division(float a, float b) {
		// TODO Auto-generated method stub
		float result= a/b;
		System.out.println("Division of  2 numbers:"+ result);
}
}