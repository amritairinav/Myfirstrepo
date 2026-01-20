package collectexample;

import java.util.HashSet;
import java.util.Set;

public class Setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>fruits=new HashSet<>();
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("amla");
		fruits.add("orange");
		fruits.add("null");
		fruits.add("");
		fruits.add("");
		
		System.out.println(fruits);
		
		//add,addall,contains,containsall,size,is empty---can be done in set
		
		fruits.remove("");
		System.out.println(fruits);
		fruits.clear();//clear all elements in list
		System.out.println(fruits);
		
	}

}
