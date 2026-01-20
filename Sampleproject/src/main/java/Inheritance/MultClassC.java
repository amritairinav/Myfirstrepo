package Inheritance;

public class MultClassC extends MultClassB {

	public void result() {
        System.out.println("Result displayed");
    }

    public static void main(String[] args) {
        MultClassC obj = new MultClassC();
        obj.add();     
        obj.display();  
        obj.result();  
    }
}
