package assignment8;

public class EmployeePaydetails3  extends EmployeePaydetails2{

	double total;
		
	public void totalsalarycalculation() {
		total = basicpay + hra + bonus - deduction - pf;
		System.out.println("Total salary is :" + total);
	}
}

	