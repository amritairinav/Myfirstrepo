package stringpackage;

public class Strex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer a=new StringBuffer("Hello");
     StringBuilder b=new StringBuilder("Hello How are You");
	 System.out.println(a);
	 System.out.println(b);
	 //insert()---to add new string to current string
	a.insert(0, "Hi");
	 System.out.println(a);//string changes to Hi Hello
	 //append()--add string to the last of another
	 	 System.out.println( a.append(b));
	 	 //replace()-replace string based on index
	 	System.out.println( a.replace(2, 4, "Amrita"));
	 	//delete-based on index
	 	System.out.println(a.delete(4, 10));
	 	//reverse()
	 	System.out.println(a.reverse());
	 	b.insert(0, "Hi");
	 	System.out.println(b);//string changes to Hi Hello
	 	System.out.println( b.append(a));
	}
}


