package interfaceex;

public class childinterface implements parentinterface{
	 static String name = "Amrita";

		  	    public static void main(String[] args) {
	        parentinterface obj = new childinterface();  // interface reference
	        obj.show();
	    }
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		 System.out.println("I am Amrita");
		 System.out.println("Age: " + age);
		// age=22; (Final field parameter cannot be initialised)
		 System.out.println("Static Name: " + childinterface.name);
	}
}