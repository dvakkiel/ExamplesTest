package collections.concepts;


import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class ExampleHashMap{
	  // no order and no indexing
	// key cannot be duplicate -duplicate key no error but latest value for the key is displayed.
	// can store n number of null values but only one null key

	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
	
        hMap.put("Ravi",120);
        hMap.put("Aarthi",340);
        hMap.put("Kabhir",450);
        hMap.put("Kabhir", 340); // duplicate key no error but latest value for the key is displayed.
        
        // Print map size
        System.out.println("The size of HashMap:" + hMap.size());
        // Printing objects in the map
        System.out.println("The map objects are :" + hMap);
        
        if (hMap.containsKey("Aarthi"))
        	{
        	  int Val = hMap.get("Aarthi");
        	  System.out.println("The value of the key is " +  Val);
        	}
        
      //  To get the keys in the Map
         for( String key : hMap.keySet())
         {
        	 System.out.println("The keys are " + hMap.keySet());
         }
        
         // to get the values in the Map
         for (Integer val : hMap.values())
         {
        	 System.out.println("The values are " + hMap.values());
         }
         
         //Iterate over the set(pair) by using EntrySet and advanced for loop
         for(Map.Entry<String, Integer> map : hMap.entrySet())
         {
        	 System.out.println("The key is "+ map.getKey() + " and value is" + map.getValue());
         }
         
         //Iterator over the keys
         Iterator<String>  it = hMap.keySet().iterator();
         while(it.hasNext())
         {
        	 String key = it.next();
        	 System.out.println("The Key is  " + key);
        	 Integer val = hMap.get(key);
        	 System.out.println("The value is " + val);
        	 
         }
         
       //Iterate over the set(pair) by using EntrySet and Iterator
              Iterator<Entry<String, Integer>> it1    = hMap.entrySet().iterator();
              while(it1.hasNext())
              {
            	     Entry<String,Integer>ent=it1.next();
            	     System.out.println("The keys are " + ent.getKey() + " The values are " +ent.getValue());
              }
      
              
       //iterate using Java 8 and lambda method.
              hMap.forEach((K,v)-> System.out.println("The key is " + K + "The value is" + v));
	}

}
