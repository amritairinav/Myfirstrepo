package exceptionex;

public class Customexcep {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		int age=12;
		if(age>18)
		{
			System.out.println("eligible for votting");
		}
		else {
			throw new MyException("Not eligible");
		}
		}

	}
