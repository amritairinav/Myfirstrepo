package encapsulation;

import java.util.Scanner;

public class ATMDetails {
	
	private int userPin;
        
	public int getUserPin() {
        switch (userPin) {
            case 1001:
            case 1234:
            case 1212:
                System.out.println("Valid PIN");
                break;
            default:
                System.out.println("Invalid PIN");
        }
        return userPin;
    }


    public void setUserPin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        this.userPin = sc.nextInt();
    }
}