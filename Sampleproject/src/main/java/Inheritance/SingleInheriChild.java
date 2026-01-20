package Inheritance;

public class SingleInheriChild extends SingleInheriParent {

    public void result() {
        System.out.println("Result is shared");
    }

    public static void main(String[] args) {
        SingleInheriChild obj = new SingleInheriChild();
        obj.add();     // parent class method
        obj.result();  // child class method
    }
}