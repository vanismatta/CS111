
public class F2CIO {

	public static void main(String[] args) {
		
		// read fahrenheit value from user
		System.out.print("Enter fahrenheit value: ");
		double fahrenheit = IO.readDouble();
		
		if (fahrenheit < -457.67) {
			System.out.println("fahrenheit must be >= -457.67");
		} else {
			double celsius = (fahrenheit-32)*5/9;
			// print result using IO module
			IO.outputDoubleAnswer(celsius);
		}

	}

}
