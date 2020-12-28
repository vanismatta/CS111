
public class FactFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		int number = IO.readInt();
		if (number <= 0) {
			IO.reportBadInput();
			return;  // stop program
		}
		
		int factorial=1;
		
		/* VERSION 1 */
		/*
		for (int i=2; i <= number; i++) {
			factorial *= i;
		}
		*/
		
		/* VERSION 2 */
		/*
		int i=2;
		for (; i <= number; i++) {
			factorial *= i;
		}
		*/
		
		/* VERSION 3 */
		/*
		int i=2;
		for (; i <= number;) {
			factorial *= i;
			i++;
		}
		*/
		
		/* VERSION 4 */
		/*
		int i=2;
		for (;;) {
			System.out.println("i="+i);
			if (i > number) {  // stop the loop if this condition is true 
				break;   // exits the loop
			}
			factorial *= i;
			System.out.println("factorial="+factorial);
			i++;
		}
		*/
		
		// counting backward
		for (int i=number; i > 1; i--) {
			factorial *= i;
		}
	
		
		IO.outputIntAnswer(factorial);
		
		
		// print all even numbers up to number
		/* VERSION 1 */
		/*
		for (int i=2; i <= number; i+=2) {  // increment i by 2
			System.out.println(i);
		}
		*/
		
		/* VERSION 2 */
		int i=1;
		while (i <= number) {
			i++;
			if (i % 2 != 0) {
				continue;    // continues to next iteration of loop, 
				             // skipping everything else from here down to the end
			}
			System.out.println(i);
		}
		
	}

}