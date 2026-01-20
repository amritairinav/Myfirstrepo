package assignment9;

public class Calculation1 extends Calculation {
	public int mathsproblem1(int a,int b) {
		int sum = super.mathsproblem(a, b); // calling parent method
        System.out.println("Sum = " + sum);

        if (sum % 10 == 0) {
            System.out.println("Addition is divisible by 10");
        } else {
            System.out.println("Addition is NOT divisible by 10");
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculation1 obj = new Calculation1();
        obj.mathsproblem1(20, 30);
    }
}
