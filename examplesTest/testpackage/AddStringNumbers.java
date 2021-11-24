package testpackage;

public class AddStringNumbers {
	
	public static int NumberAddition(String str) {
		
		
		String temp = "0";
		int sum =0;
		for(int i =0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			//  if character is Digit
			if(Character.isDigit(ch))
			{
				temp+= ch;
			}
			// if character is alphabet
			else
			{
				sum+=Integer.parseInt(temp);
				//reset temp to 0
				temp = "0";								
			}			
		}
		return sum + Integer.parseInt(temp);
	}	
	public static void main (String[] args)
	{
	  
	 String	str = "1abc2x30yz67";
	 System.out.println(NumberAddition(str));
   }
	

}
