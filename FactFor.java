
public class FactFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		int number = IO.readInt();
		if (number <= 0) {
			IO.reportBadInput();
			return;  // stop program
		}
		
		int factorial=1;
		for (int i=2; i <= number; i++) {
			factorial *= i;
		}
		IO.outputIntAnswer(factorial);
	}

}