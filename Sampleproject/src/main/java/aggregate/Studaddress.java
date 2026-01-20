package aggregate;

public class Studaddress {
	String add1;
	String add2;
	int pincode;
	StudentDetails ref;
 public void studdetails(String a,String b,int zip, StudentDetails r) {
	 add1=a;
	 add2=b;
	 pincode=zip;
	 ref=r;
	 	}
 
 public void display() {
	 System.out.println("Name: " + ref.name);
     System.out.println("Roll #: " + ref.roll);
     System.out.println("Address 1: " + add1);
     System.out.println("Address 2: " + add2);
     System.out.println("Pincode: " + pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj1=new StudentDetails();
		obj1.studdetails("Amrita" , 111);
		Studaddress obj=new Studaddress();
		obj.studdetails("aaa" ,"bbb",2222,obj1);
		obj.display();
		

	}

}
