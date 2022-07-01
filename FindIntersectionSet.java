package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		//List<Integer> list2= new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(11);
	    list.add(4);
	    list.add(6);
	    list.add(7);
	   
	    List<Integer> list1= new ArrayList<Integer>();
	    list1.add(1);
	    list1.add(2);
	    list1.add(8);
	    list1.add(4);
	    list1.add(9);
	    list1.add(7);
	    
	    Collections.sort(list);	
	    
	    Collections.sort(list1);
	    int s1=list.size();
	    int s2=list1.size();
	    for(int i=0;i<s1;i++) {
	    for(int j=0;j<s2;j++)
	    {
	    	if(list.get(i)==list1.get(j)) {
	    		System.out.println(list.get(i));
	    }
	    
	 // System.out.println(list);
	  //  System.out.println(list1);
	    
	}

	
	}
	
}}

