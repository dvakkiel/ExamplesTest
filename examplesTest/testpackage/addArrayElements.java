package testpackage;

import java.util.Arrays;
import java.util.Scanner;

public class addArrayElements {
	


	public static void main(String args[])
	{       
		   
		
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number of elements in first array: ");
		    int array1size = scan.nextInt();
		    System.out.println("Enter number of elements in second array: ");
		    int array2size = scan.nextInt();	
		    int array1[] = new int[array1size];
		    int array2[]= new int[array2size];
		    int array3[] = new int[array1size];
		    System.out.println("Enter elements for first array");
		    for(int i=0; i< array1size; i++)
		    {
		    	array1[i]=scan.nextInt();
		    }
		    
		    System.out.println("Enter elements for Second array");
		    for(int i=0; i< array2size; i++)
		    {
		    	array2[i]=scan.nextInt();
		    }
		    
		    for(int i=0; i<array1.length; i++)
		    {
		    	array3[i] = array1[i] + array2[i];
		    }
		    
		    System.out.println(Arrays.toString(array3));
	
	}
}
