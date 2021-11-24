package testpackage;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters2 {
	public static void countDuplicateCharacters(String str)
	
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] charArray =str.toCharArray();
		for(char ch : charArray)
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
		
		// to iterate through only Map key
		for(char key : map.keySet())
		{
			System.out.println("The keys are " + map.keySet());
		}
		
		// to iterate through only Map values
		for (int value : map.values())
		{
			System.out.println("The values are" + map.values());
		}
		// for both keys and values
		for (Map.Entry<Character ,Integer > entry : map.entrySet())
		{
			System.out.println("The null values are " + entry.getKey()!=null);
			if(entry.getValue() > 1 && entry.getKey()!= null)
			System.out.println( "The character " + entry.getKey() + " appears " +  entry.getValue() + " times. ");			
			
		}
	}
public static void main(String args[])
		{
	      String str = "HappyBirthdayToYou And You";
	      countDuplicateCharacters(str);
		}
	}


