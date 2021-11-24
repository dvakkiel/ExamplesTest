package testpackage;

/* to count students in different branches in college  without static keyword*/

public class testCollege {
	
 static int count = 0;
testCollege(){
	count ++;
	System.out.println("The counter value is : " + count);
	
}

public static void main (String [] args)
{
	testCollege cse1= new testCollege();
	testCollege cse2= new testCollege();
	testCollege ece1 = new testCollege();
	testCollege ece2 = new testCollege();
}
}

/* the above program syntax is correct.. but counter is always 1 */
/* but when we use static for int count, the counter values increases and stays the same for all
 * objects created in the class.
 */


