package collections;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ColourReverseset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<String>();
		
		set1.add("Red");
		set1.add("Green");
		set1.add("Blue");
		set1.add("Yellow");
		set1.add("Brown");
		System.out.println("orginal set is" +set1);
		List<String>list=new ArrayList<>(set1);
		int size=list.size();
		for(int i=size-1;i>=0;i--)
		{

System.out.println(list.get(i));
}
	}
}