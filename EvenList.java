package week1.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	    list.add(1);
	    list.add(12);
	    list.add(22);
	    list.add(34);
	    list.add(31);
	    list.add(97);
	    list.add(1154);
	    list.add(32);
	    list.add(2445);
	    list.add(57);
	    list.add(88);
	    list.add(1);
	    list.add(12);
	    list.add(22);
	    System.out.println(list);   
	    int size = list.size();
	    System.out.println (" Even numbers in the list are"); 
	
	for(int i=0;i<size;i++)
	{
		
		if (list.get(i)%2==0)
		{

	
	System.out.println (list.get(i));
	
		}
	}
	}
}
	
		
	
	

	

	
