package Inheritance;

public class HierarchyClassC extends HierarchyClassA{

	public void result() {
        System.out.println("Result displayed");
    }

    public static void main(String[] args) {
    	HierarchyClassC obj = new HierarchyClassC();
        obj.add();      
        obj.result();
    }
}