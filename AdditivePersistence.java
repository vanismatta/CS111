
public class AdditivePersistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = getInput();
		
	}

	private static int sumDigits(int number) {
		// TBD
	}
	
	private static int getInput() {
		int number;
		do {
			System.out.print("Enter number (> 0): ");
			number = IO.readInt(); 
		} while (number <= 0);
		return number;
	}
}


	private static int sumDigits(int number) {
		int sum = 0;
		while (number >= 10) {  // at least 2 digits
			sum += number % 10;
			number /= 10;
		}
		sum += number;
		return sum;
	}
	
	// needs to return number and root, can do it using an int array of length 2
	public static int[] computePersistence(int number) {
		int persistence = 0;
		while (number >= 10) {
			number = sumDigits(number);
			persistence++;
		}
		int[] result = new int[2];
		result[0] = persistence;
		result[1] = number;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = getInput();
		
		int[] result = computePersistence(number);
		
		System.out.println("persistence="+result[0]+",digital root="+result[1]);
	}

	private static int getInput() {
		int number;
		do {
			System.out.print("Enter number (> 0): ");
			number = IO.readInt(); 
		} while (number <= 0);
		return number;
	}
}
