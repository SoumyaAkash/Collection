package week1.day4;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class Colourset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new LinkedHashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Blue");
		set.add("Yellow");
		set.add("Brown");
		System.out.println("orginal set is" +set);
		int size=set.size();
		for(int i=size-1;i>=0;i--)
		{
set.addAll(set);
	}
System.out.println(set);
}
}