package Inheritance;

public class HierarchyClassB  extends HierarchyClassA{

	public void display() {
        System.out.println("Addition done ");
    }
	public static void main(String[] args) {
    	HierarchyClassB obj = new HierarchyClassB();
        obj.add();      
        obj.display();
    }
}
