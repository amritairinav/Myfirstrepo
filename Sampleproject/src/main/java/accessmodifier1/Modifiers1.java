package accessmodifier1;

public class Modifiers1 extends AccesssModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifiers1 obj1=new Modifiers1();
		obj1.pub1();
		//obj1.priv1();outside class is not possible
		obj1.prot1();
		obj1.def();

	}
}

