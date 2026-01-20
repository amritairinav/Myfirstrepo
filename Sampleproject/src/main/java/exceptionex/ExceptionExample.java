package exceptionex;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {	
int a=7;
int b=0;
int c=a/b;
System.out.println(c);

} catch (ArithmeticException obj) {
    System.out.println("Exception caught");
}
	
	finally
	{
        System.out.println("exit");
    }

    System.out.println("hello.");	
		
	try {	
int[] arr = {10, 20, 30}; 
		
for(int i=1;i<=3;i++)
{

 System.out.println(arr[i]);
}
	}
 catch (ArrayIndexOutOfBoundsException obj) {
	    System.out.println("Exception caught");
	}
	finally
	{
        System.out.println("exit1");
    }

    System.out.println("hello1.");	
		
    Integer[] numbers = new Integer[3]; 

    try {
        numbers[0] = 10;
        numbers[1] = 20;

        // numbers[2] is null, so adding 5 will throw NullPointerException
        System.out.println(numbers[2] + 5);
    } catch (NullPointerException obj) {
        System.out.println("Exception caught successfully");
    } 

   
}
}

	


