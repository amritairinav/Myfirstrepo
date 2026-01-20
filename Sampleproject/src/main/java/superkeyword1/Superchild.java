package superkeyword1;

public class Superchild extends Superparent {
	String color="red";
	
	public void display() {
			System.out.println(super.color);
	}

	public static void main(String[] args) {
		Superchild obj1=new Superchild();
		obj1.display();
		System.out.println(obj1.color);
	}

}
