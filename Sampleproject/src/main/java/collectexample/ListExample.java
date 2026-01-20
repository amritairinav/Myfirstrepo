package collectexample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create List
		List<String> Vehicles=new ArrayList<String>();
		//add elements to collection
		Vehicles.add("Car");
		Vehicles.add("Bus");
		Vehicles.add("Bus");
		Vehicles.add("Van");
		
		System.out.println(Vehicles);
		
		//Get index of an element
		System.out.println("Index of Van:" + Vehicles.indexOf("Van"));
		System.out.println("Index of Bus:" + Vehicles.indexOf("Bus"));
		//if repeated elements,first occurance is displayed
		 System.out.println("Index of Bus (last): " + Vehicles.lastIndexOf("Bus"));
		//if repeated elements,last occurance is displayed
		 Vehicles.remove("Car");//remove by object
		 System.out.println(Vehicles);
		 Vehicles.remove(0);//remove by index
		 System.out.println(Vehicles);
		 Vehicles.add("Car");
			Vehicles.add("Bus");
			Vehicles.add("Bus");
			Vehicles.add("Van");
			System.out.println(Vehicles);
		 //contains---to check if an element in collection
		 System.out.println("Does it contain Bus?" + Vehicles.contains("Bus"));
		 System.out.println("Does it contain Car?" + Vehicles.contains("Car"));		 
		 //Is empty---to check if collection is empty
		 
		 if(Vehicles.isEmpty()) {
			 System.out.println("List is empty");} else {
				 System.out.println("List is not empty");} 
		 //get-retreive elements
		 System.out.println("Second Vehicle:"  + Vehicles.get(1));	
			//size of  
		 System.out.println("Size:"  + Vehicles.size());
		 for (int i=0;i< Vehicles.size();i++) {
			 System.out.println("Elements:" + Vehicles.get(i));	 
		 }
		 for( String Vehicle:Vehicles) {
			 System.out.println(Vehicle);
			 
		 }
		 }
	}


