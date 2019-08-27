/* Sydney Davidson
   Lab 2
   CSI 213 */

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
	String input;
	Scanner scanner = new Scanner(System.in);

	System.out.print("Please enter a word to test if it's a palindrome: ");
	input = scanner.nextLine();

	if(palTest(input))  // calls the method that tests the string to see if it's a palindrome
		System.out.println(input + " is a palindrome.");
	else
		System.out.println(input + " is not a palindrome.");
}

	/** Tests if a String is a palindrome or not 
	
	@param String the string that is being tested to see if it's
				  a palindrome or not
	@return returns true or false depending if the string is 
			a palindrome    

	*/

	public static boolean palTest(String test){

		// if the string length is 0 or 1 then returns true
		if(test.length() == 0 || test.length() == 1)
			return true;
		
		// if the first character is equal to the next
		if(test.charAt(0) == test.charAt(test.length()-1))
			/* method calls itself to repeat the process for other characters
			   in the string */
			return palTest(test.substring(1, test.length()-1));

		else 
			// returns false if the string is not a palindrome
			return false;


	}
}
