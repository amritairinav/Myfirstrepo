package accessmodifier1;

public class AccesssModifier1 {
	
	public void pub1() {
		System.out.println("This is a public method");
	}

	private void priv1() {
		System.out.println("This is a private method");
	}
	
	protected void prot1() {
		System.out.println("This is a protected method");
	}
	
	void def() {
		System.out.println("This is a default method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesssModifier1 obj1=new AccesssModifier1();
		obj1.pub1();
		obj1.priv1();
		obj1.prot1();
		obj1.def();

	}

}
