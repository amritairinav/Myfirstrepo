package assignment8;

import java.util.Scanner;

public class EmployeePayDetails {
	
	double  basicpay;
	double  deduction;
	double  bonus;
public void getdetails() {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter Basic Pay: ");
    basicpay = sc.nextDouble();

    System.out.print("Enter Deduction: ");
    deduction = sc.nextDouble();

    System.out.print("Enter Bonus: ");
    bonus = sc.nextDouble();
}
}


	

	
	  

	


