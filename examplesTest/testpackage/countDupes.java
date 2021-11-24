package testpackage;

import java.util.HashMap;
import java.util.Map;

public class countDupes {

	public static void main(String[] args) {
		duplicateCharacters("Happy Happy Test");
		

	}
	
	
	public static void duplicateCharacters(String str)
	{
		char[] charArray = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(Character ch: charArray)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
		      }
	     }
		
		// to get the number of times a key is present in map
		for(Map.Entry<Character, Integer> map1 : map.entrySet())
		{
			if(map1.getValue() > 1 && map1.getKey() != null)
			{
			System.out.println("The character " + map1.getKey() + " is present " + map1.getValue() + " times");
		   }

        }
}
}
