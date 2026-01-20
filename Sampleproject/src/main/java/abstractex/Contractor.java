package abstractex;

public class Contractor extends Employee{

	/*public Contractor(String Name, String Status) {
		super(Name, Status);
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public void CalculateSalary() {
		// TODO Auto-generated method stub
		int amt=100;
		int hrs=5;
		int salary= amt * hrs;
		System.out.println("Salary of Contractor:" + salary);
		
	}

}
