package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurancesMap {
	static void characterCount(String str)
	{
	Map<Character,Integer> map1 = new TreeMap<>();
	String str1="java";
	
	// Convert string to CharArray
	char[] A=str1.toCharArray();
	
for(char result: A)
{
if(map1.containsKey(result))
{
	map1.put(result,map1.get(result)+1);
}
	else
	{
		map1.put(result,1);
	}
}
for (Map.Entry e : map1.entrySet())
{
System.out.println(e.getKey() + "  ---> " + e.getValue());	
}
}

	public static void main(String[] args) {
		
		String str = null;
		characterCount(str);
		
	}
}
