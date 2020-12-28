
public class charAndBoolean {

	public static void main(String[] args) {
		char myChar = '\u00A9';
		// after = can only store one character or number or special character
		// unicode character can be any type of character . Go on https://unicode-table.com/en/
		System.out.println(myChar);

		boolean myBoolean = false;
		boolean isMale = true;
		// can only be true or false
		
		//CHALLENGE//
		//1. Find the code for the registered symbol on the same line as the copyright symbol
		//2. Create a variable of type char and assign it the unicode value for that symbol
		//3. Display in on screen
		
		char regChar = '\u00AE';
		System.out.println("Register Character " + regChar);
		
		
	}

}
