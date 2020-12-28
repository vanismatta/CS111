
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter number: ");
		int number = IO.readInt();
		if (number <= 0) {
			IO.reportBadInput();
			return;  // stop program
		}
		
		/* VERSION 1
		int factorial=1;
		while (number > 1) {
			factorial = factorial * number;
			// OR, factorial *= number;
			number = number - 1;
			// OR, number -= 1;
			// OR, number--;
			// OR, --number;
		}
		*/
		
		int factorial=1, tally=1;
		do {
			factorial *= tally;
			tally++;
		} while (tally <= number);
		
		IO.outputIntAnswer(factorial);
		

	}

}