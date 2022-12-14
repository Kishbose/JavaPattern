package JavaPatterns;

import java.util.ArrayList;
import java.util.Arrays;
//Java program to remove duplicates from ArrayList 
public class Remove_Duplicate_List {
	   // Function to remove duplicates from an ArrayList 
	    public static ArrayList<Object> removeDuplicates(ArrayList<Object> list) { 
	  
	        // Create a new ArrayList 
	        ArrayList<Object> newList = new ArrayList<>(); 
	  
	        // Traverse through the first list 
	        for (Object element : list) { 
	            // If this element is not present in newList 
	            // then add it 
	            if (!newList.contains(element)) { 
	                newList.add(element); 
	            } 
	        } 
	        // return the new list 
	        return newList; 
	    } 
	  

	    public static void main(String args[]) { 
	  
	        // Get the ArrayList with duplicate values 
	        ArrayList<Object> list = new ArrayList<>( 
	                Arrays .asList(1, 10, 1, 2, 2, 3,"Prabu", 3, 10, 3, 4, 5, 5,"Prabu","Greens")); 
	  
	        // Print the Arraylist 
	        System.out.println("ArrayList with duplicates: "+ list); 
	  
	        // Remove duplicates 
	        ArrayList<Object> newList = removeDuplicates(list); 
	  
	        // Print the ArrayList with duplicates removed 
	        System.out.println("ArrayList with duplicates removed: "+ newList); 
	    } 
	} 


