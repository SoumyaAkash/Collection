package week1.day4;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> color = new ArrayList<String>();
		//List<String> colorrev = new ArrayList<String>();
		
		color.add("Red");
	    color.add("Green");
	    color.add("Blue");
	    color.add("Yellow");
	    color.add("Brown");
	    System.out.println("orginal list is "+color);
	    int size = color.size();
	   System.out.println("Size of the list "+size);
List<String> result = new ArrayList<String>();
	for (int i=size-1 ;i>=0; i--) {
	result.add((color.get(i)));
	}
	
	System.out.println(result);
	}
	//return result;
}


