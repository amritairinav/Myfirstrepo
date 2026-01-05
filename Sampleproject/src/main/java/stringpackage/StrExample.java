package stringpackage;

public class StrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Amrita";
		String name1="Hello";
		String str1="hello how are you";
		String str2="HOW DO YOU DO";
		String str3="     what is your name?              ";
		String str4="AMRITA";
		String str5="AMRITA";
		String str6=new String("Hello");
		String str7=new String("Hello");
		String studentname=new String("Anamika");
		int a=100;
		System.out.println(name);
		System.out.println(name1);
		System.out.println(studentname);
		System.out.println(studentname.length());//length of string
		System.out.println(name.length());//length of string
		System.out.println(name.charAt(4));//return character of string	
		System.out.println(studentname.charAt(6));//return character of string
		System.out.println(name1.charAt(1));//return character of string
		System.out.println(name1.concat(name));//string concatination add 2 strings
		System.out.println(name1.contains(name));//check if character exists in the string
		System.out.println(studentname.contains("m"));//check if character exists in the string
		System.out.println(studentname.contains("z"));//check if character exists in the string
		System.out.println(str1.toUpperCase());//to uppercase
		System.out.println(str2.toLowerCase());// to lower case
		System.out.println(str1.toLowerCase());// to lower case
		//isempty-to check if string is empty or not===>True or False
		System.out.println(str2.isEmpty());//false
		System.out.println(str3.isEmpty());//true
		System.out.println(name.equals(str4));//check if strings are equal---false (case sensitive)
		System.out.println(str5.equals(str4));//check if strings are equal
		System.out.println(name.equalsIgnoreCase(str4));//check if strings are equal(not case sensitive)
		System.out.println(str5==str4);//check if strings are equal(case sensitive)
		System.out.println(name==str4);//check if strings are equal(case sensitive)
		System.out.println(name1==str6);//check if strings are equal(case sensitive)
		System.out.println(name1.equals(str6));//check if strings are equal---false (case sensitive)
		//Equal operator is used to compare the object reference/location
		//and does not compare the value.
		//But equals method compares value 
		System.out.println(str7.equals(str6));//check if strings are equal---false (case sensitive)
		System.out.println(str7==str6);//check if strings are equal---false (case sensitive)
	//valueof()--->string conversion/convert any data type to string
		System.out.println(String.valueOf(a));
		//trim()---remove leading and trailing white spaces and do not remove space in between words
		System.out.println(str3.trim());
		System.out.println(str3);
		//substring()---abstract one word from multiple words
		System.out.println(str1.substring(0,5));
		System.out.println(str1.substring(2));
			}

}
