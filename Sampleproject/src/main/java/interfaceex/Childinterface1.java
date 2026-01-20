package interfaceex;

public class Childinterface1 implements Parentinterface1,Parentinterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Childinterface1 obj=new Childinterface1();
		//obj.show();
		//obj.show1();
		Parentinterface1 obj1=new Childinterface1();
		obj1.show();
		Parentinterface2 obj2=new Childinterface1();
		obj2.show1();
		

	}

	@Override
	public void show1() {
		System.out.println("Iam from kerala");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Iam from Calicut");
		
	}

}
