package superkeyword1;

public class Superchild3 extends Superparent3 {
	
	public Superchild3() {
		super(400,500);
		int a=200;
		int b=300;
		int sum=a + b;
		System.out.println("Sum of 2 numbers :" + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Superchild3 obj1=new Superchild3();
		
	}

}
