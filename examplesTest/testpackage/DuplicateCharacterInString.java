package testpackage;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {
	
	 public static void main(String args[])	{
/*	String str= "Great Responsibility";
	char[] ch = str.toCharArray();
	int count = 0;
	for(int i =0; i<ch.length; i++)
	{
		for (int j = i+1; j<ch.length; j++)
		{
			if(ch[i]==ch[j]  &&  ch[i]!= 0)
				
			{								
			    System.out.println("The duplicate characters in string is " + ch[i]);
			    count++;
			    ch[j] = 0;
			    break;
			    
			}
		}
	}System.out.println("The number of duplicate characters is " + count);*/
	
   
	 
	 
	 String str2 = "Happy Happy";
	 char[] ch2 = str2.toCharArray();
	 int sum =0;
	 for (int i = 0; i<ch2.length ; i++) {
		 
		 for(int j= i+1; j<ch2.length ; j++) {
			
			 if(ch2[i] == ch2[j] && ch2[i] != 0) {
				 
				 sum++;
				 System.out.println("The duplicate character  are " + ch2[i]);
				 ch2[j] =0;
				 break;
			 }
				 
		 }
	 } System.out.println("There are " + sum + "duplicate characters in the string");
	}
}
	
		
		
	

	
	

