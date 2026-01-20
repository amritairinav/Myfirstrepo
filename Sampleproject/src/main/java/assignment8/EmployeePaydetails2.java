package assignment8;

public class EmployeePaydetails2 extends EmployeePayDetails {
	
	double hra;
	double  pf;
	
	public void hracalculation() {
		hra=basicpay *.05;
		pf=basicpay *.20;
		System.out.println("HRA is :" +hra);
		System.out.println("PF is :" +pf);
	}
	
	

}
