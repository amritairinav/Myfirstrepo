package encapsulation;

public class Details {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setName("Amrita");
		obj.setAge(33);
		System.out.println("Name:" +obj.getName());
		System.out.println("Age:" +obj.getAge());
	}

}
