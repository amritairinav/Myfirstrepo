package exceptionex;

public class ThrowEx {
//declare exception
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int age=12;
		if(age>18)
		{
			System.out.println("eligible for votting");
		}
		else {
			throw new ArithmeticException("Not eligible");
		}
		}

	}


