package listConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {
// dynamic array - Array List
// can contain duplicate values or elements.
// maintains insertion order
// Synchronised - not thread safe
// allows random access of elements because it stores elements based on indexes.	
	public static void main(String args[]) {
      ArrayList ar = new ArrayList();
      ar.add(20);
      ar.add("Hashberry");
      ar.add(true);
      ar.add(12.3990);
      // To get size of array.
      System.out.println("The size of array" + ar.size());
      // The above array is non-generic and of raw type (without array type defined) that is why we have yellow markings.
      System.out.println("Random element from array"+ ar.get(3));
      for(int i =0 ; i< ar.size(); i++)
      {
    	  System.out.println("The elements in array : " + ar.get(i));
      }
 ArrayList<String> ar1 = new ArrayList<String>();
 ar1.add("Happy");
 ar1.add("Birthday");
 //ar1.add(20); // throws error as the array type was defined as String
 
    
 
 //When not sure with what values to add to arraylist
 //ArrayList<e> ar3 = new ArrayList<e>();
 
 // Adding  user defined  class objects to an arrayList.
 
 // Adding Employee class objects.
 Employee e1 = new Employee("Deep",34,"QA Lead");
 Employee e2 = new Employee("Deeksha",27,"HR Manager");
 Employee e3 = new Employee("Prithvi",26,"Sales Officer");
 Employee e4 = new Employee("Parvathi",29,"Office Admin");
 
 // Creating an ArrayList to hold Employee Objects.
   ArrayList<Employee> ar2 = new ArrayList<Employee>();
   ar2.add(e1);
   ar2.add(e2);
   ar2.add(e3);
   ar2.add(e4);
   
   // To iterate through the list of Employee object and print them we use Iterator
  Iterator<Employee> it = ar2.iterator();
  while(it.hasNext())
  {
	  Employee E = it.next();	  
	  System.out.println("The Employee objects are "+ E.name);
	  System.out.println("The Employee objects are "+ E.age);
	  System.out.println("The Employee objects are "+ E.dpt);
  }
  
  //addAll to add elements of one array to another
  
  ArrayList<String> ar3 = new <String>ArrayList();
  ar3.add("Java");
  ar3.add("Python");
  ar3.add("Cobol");
  
  ArrayList<String> ar4 = new <String>ArrayList();
  ar3.add("Raikonen");
  ar3.add("McLaren");
  ar3.add("Cobol");
 
  ar3.addAll(ar4);
  for(int i =0; i < ar3.size(); i++)
  {
	  System.out.println(ar3.get(i));
  }
 

  
//retainAll to find the union of both arrays ie. the common values in both the arrays.
 ar3.retainAll(ar4);
 for(int i =0; i < ar3.size(); i++)
 {
	  System.out.println(ar3.get(i));
 }
 
 
// removeAll to remove the elements of one array from another  
 ar3.removeAll(ar4);
 for(int i =0; i < ar3.size(); i++)
 {
	  System.out.println(ar3.get(i));
 }
	}
}

