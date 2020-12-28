
public class floatAndDouble {

	public static void main(String[] args) {
		// width of int = 32 ( 4 bytes)
		int myIntValue = 5;
		// width of float = 32 (4 bytes)
		float myFloatValue = 5f /3f;
		// width of double = 64 (8 bytes)
		double myDoubleValue = 5d /3d;
		//java automatically assumes its a double. you need to put an f after a decimal declared float. you dont need to put a d after a decimal declare double.
		System.out.println ("myIntValue="+ myIntValue);
		System.out.println ("myFloatValue="+ myFloatValue);
		System.out.println ("myDoubleValue="+ myDoubleValue);

	//CHALLENGE//
		//1. Create a variable to store the number of pounds
		//2. Calculate the number of Kilograms for the number above and store in a variable 
		//3. Print out the result
		//
		// NOTES: 1 pound is equal to 0.45359237 kilograms
		
		double numPounds = 200d;
		double convertedKilo = 0.45359237d * numPounds;
		System.out.println("Kilograms =" + convertedKilo);
		// 90.7185
		
		
		
		
	}

}
