package abstractex;

public class Fulltimeemployee extends Employee {

	/*public Fulltimeemployee(String Name, String Status) {
		super(Name, Status);
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fulltimeemployee obj=new Fulltimeemployee();
		obj.CalculateSalary();
		Contractor obj1=new Contractor ();
		obj1.CalculateSalary();

	}

	@Override
	public void CalculateSalary() {
		// TODO Auto-generated method stub
		
		int amt=100;
		int hrs=8;
		int salary= amt * hrs;
		System.out.println("Salary of FTE:" + salary);
		
	}

}