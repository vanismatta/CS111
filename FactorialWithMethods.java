
public class FactorialWithMethods {

	public static void main(String[] args) {
		int number=getInput();
		
		int fact = factorial(number); // call factorial with number as input "argument"
		System.out.println(number+"!="+fact);
		/* Or
		 * System.out.println(number+"!="+factorial(number));
		 */
	}

	private static int factorial(int number) {
		int factorial=1;
		while(number>1) {
			
			factorial=factorial*number;
			//OR, factorial *= number;
			number=number-1;
			//OR, number-= 1
			//OR, number --;
			//OR, -- number;
			
		}
		return factorial;
	}

	private static int getInput() {
		int number;
		while (true) {
		System.out.print("ENTER NUMBER (>0): ");
		number = IO.readInt();
		if (number > 0) {
			break;
		}
		}
		/* or
		 	do {
		 	System.out.print("Enter number (>0(: ");
		 	number=IO.readInt();
		 	} while (number <=0);
		 */
		return number;
	}

	}


