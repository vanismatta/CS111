
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter base: ");;
		double base = IO.readDouble();
		System.out.print("Enter exponent (integer > 0): ");
		int exponent = IO.readInt ();
		
		if (exponent <= 0) {
			IO.reportBadInput();
			return;
		}
	
	double result = Math.pow(base,  exponent);
	IO.outputDoubleAnswer(result);	
		
	}
}
