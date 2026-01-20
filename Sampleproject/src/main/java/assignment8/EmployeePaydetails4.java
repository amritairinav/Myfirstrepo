package assignment8;

public class EmployeePaydetails4 extends EmployeePaydetails3 {
	
	public void getsalarydetails() {
		    System.out.println("Basic Pay   : " + basicpay);
	        System.out.println("HRA         : " + hra);
	        System.out.println("PF          : " + pf);
	        System.out.println("Bonus       : " + bonus);
	        System.out.println("Deduction   : " + deduction);
	        System.out.println("Total Salary: " + total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeePaydetails4 obj=new EmployeePaydetails4();
		obj.getdetails();
		obj.hracalculation();
		obj.totalsalarycalculation();	
		obj.getsalarydetails();
		
	}

}
