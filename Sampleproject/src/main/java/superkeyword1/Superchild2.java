package superkeyword1;

public class Superchild2 extends Superparent2 {

public void calculation(int a,int b) {
	super.calculation(200, 300);
	int diff=a-b;
	System.out.println("Difference of 2 numbers:" + diff);

}

	public static void main(String[] args) {
		Superchild2 obj1=new Superchild2();
		obj1.calculation(200,300);
			}

}
