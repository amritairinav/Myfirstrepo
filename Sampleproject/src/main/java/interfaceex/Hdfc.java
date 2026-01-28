package interfaceex;

public class Hdfc implements RbiInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RbiInterface obj=new Hdfc();
		obj.recurringDeposit();

	}

	@Override
	public void recurringDeposit() {
		// TODO Auto-generated method stub
		double finalamount=amount*(1+.6);
		System.out.println("Final Amount is" + finalamount);
	}

}
