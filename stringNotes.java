
public class stringNotes {

	public static void main(String[] args) {
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2015";
		System.out.println("myString is equal to " + myString);
		
		// all adds on to each other
		
		String numberString ="250.55";
		numberString = numberString + 49.95;
		System.out.println("the result is" + numberString);
		// cant treat string as a number. it doesn't change it to an integer
		
		String lastString = "10";
		int myInt = 50;
		lastString =lastString + myInt;
		System.out.println("Last string is equal to " + lastString);
		double doubleNumber = 120.47;
		lastString= lastString+ doubleNumber;
		System.out.println("LastString Value: " + lastString);
		
		
		
	}

}
