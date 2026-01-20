package abstractex;

public class Childabstract1 extends Parentabstract1{

	public Childabstract1(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
		sum=a+ b;
		System.out.println("Sum of 2 numbers:" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childabstract1 obj=new Childabstract1(12,12);

	}

}
