package collectexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ArrayList<String> Vehicles = new ArrayList<String>();
		    Vehicles.add("Car");
	        Vehicles.add("Bus");
	        Vehicles.add("Van");
	        Vehicles.add("Bike");
	        Vehicles.add("Jeep");
	        Vehicles.add("Cycle");
	        System.out.println(Vehicles);
	        
	        ArrayList<String> Colors = new ArrayList<String>();
	        Colors.add("Green");
	        Colors.add("Violet");
	        Colors.add("Blue");
	        Colors.add("Green");
	        Colors.add("White");
	        Colors.add("Red");
	        System.out.println(Colors);
	        
	     // Add Vehicles into Colors
	        System.out.println(Colors.addAll(Vehicles));
	        System.out.println(Colors);
	        System.out.println(Vehicles);
	        
	        //Returns true or false-Contains all
	        
	        System.out.println("Colors contains all elements of Vehicles: " + Colors.containsAll(Vehicles));
	        Iterator<String>itr=Colors.iterator();
	        while(itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
	        	itr.remove();
	        		        
	        System.out.println(Colors);
	    }
	}
	 

