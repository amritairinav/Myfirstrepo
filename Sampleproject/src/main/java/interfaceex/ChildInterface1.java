package interfaceex;

public class ChildInterface1 implements ParentInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentInterface1 obj=new ChildInterface1();//Reference creation
		obj.sum();
		obj.display();
		obj.show();
		ParentInterface1.result();

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int sum=number1+number2;
		System.out.println("Sum of 2 numbers:" +sum);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Iam Amrita Irinav from Kerala");
		
	}

}
