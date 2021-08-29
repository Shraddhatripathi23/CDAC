import java.util.ArrayList;
import java.util.Collections;
public class Arylist {
	public static void main(String[] args){
		
		 ArrayList<String> obj = new ArrayList<String>();

	      //add elements to an ArrayList
	      obj.add("Shraddha");
	      obj.add("Tripathi");
	      obj.add("Cdac");
	      obj.add("may");
	      obj.add("batch");

	      // Displaying elements
	      System.out.println("Original ArrayList:");
	      for(String str:obj)
	         System.out.println(str);

	      //Add element at the given index
	       
	      obj.add(0, "Rahul");
	      obj.add(1, "Justin");

	      // Displaying elements
	      System.out.println("ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove elements from ArrayList 
	      obj.remove("batch"); 
	      obj.remove("cdac"); 

	      
	      System.out.println("ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove element from the specified index
	      obj.remove(1); 

	     
	      System.out.println("Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);

	      //iterating ArrayList
	      System.out.println("iterating ArrayList:");
	      for(String str:obj)  
	         System.out.println(str);
	
	      //size of arraylist
	      System.out.println("Number of elements in ArrayList: "+obj.size());
	      
	      //sort arraylist
	      Collections.sort(obj);

	      for (String str : obj) {
	         System.out.println(str);
	      }
	      
	      //set oprn
	      obj.set(0, "Lucy");
	      System.out.println("After srt oprn ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	}
}