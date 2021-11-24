package testpackage;

public class ReverseString {
	
	
	public static void reverseStr(String str) {
		
	/* Using String builder class */
	
	StringBuilder rStr = new StringBuilder(str);
	rStr.reverse();
	System.out.println("The reversed string is " + rStr.toString());
    }
	
	/* Using reverse iteration in for loop */
	public static String revStr (String str)
	{
		char[] charArray = str.toCharArray();
		String rev = "";
		for (int i=charArray.length-1; i>=0; i--)
		{
			rev+=charArray[i];
		}
		return rev;
	}
	
	public static void main (String args[])
	{
		String str = "HappyLife";
		reverseStr(str);
		String reversedStr = revStr("Good Morning India");
		System.out.println("The reversed string is " + reversedStr);
	  
    }
	}
