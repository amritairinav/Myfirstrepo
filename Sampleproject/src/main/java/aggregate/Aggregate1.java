package aggregate;

public class Aggregate1 {
	String name;
	int age;
	Aggregate2 ref;
	public Aggregate1(String name,int age,Aggregate2 ref) {
		this.name=name;
		this.age=age;
		this.ref=ref;
	}
	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Name:" + ref.name);
		System.out.println("Age:" + ref.age);
	}
	public static void main(String[] args) {
		Aggregate2 obj1=new Aggregate2("Veena",30);
		Aggregate1 obj=new Aggregate1("Amrita",25,obj1);
		obj.display();
				
		
		
	}

}
