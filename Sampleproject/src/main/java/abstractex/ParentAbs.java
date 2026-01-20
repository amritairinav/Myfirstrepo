package abstractex;

public abstract class ParentAbs {
	
	public abstract int display();// abstract method without parameter
	public abstract void show(float a,float b);
	public  void multiply(float a,float b) {
		float c=a*b;
		System.out.println("Multiplication of 2 numbers:" + c);
	}
	
	public ParentAbs() {
		System.out.println("Default Constructor");
	}

}
