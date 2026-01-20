package assignment10;

public class Offseason extends Onseason {
		
		@Override
	public void displaydiscount() {
		// TODO Auto-generated method stub
		double discount = amount * 0.15;
	    System.out.println("Discount during Offseason is: " + discount);
		super.displaydiscount();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Offseason obj=new Offseason();
		obj.amount=5000;
		obj.displaydiscount();
	}

}
