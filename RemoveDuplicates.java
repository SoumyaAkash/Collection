package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
	String text = "We learn java basics as part of java sessions in java week1";
		
	String[] s=text.split(" ");
		
		Set<String> set1= new LinkedHashSet<String>();
	for(String output :s)
	{
 set1.add(output);
			
	}
	System.out.println(set1);
	}
	}