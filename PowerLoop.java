public class PowerLoop {

	public static void main(String[] args) {
	
		System.out.print("Enter number: ");
		int number = IO.readInt();
		
		// keep asking user until they input power > 1
		int power;  // need to declare power outside block so it's visible in
		            // the while condition check after the block
		do {
			System.out.print("Enter power > 1: ");
			power = IO.readInt();
		} while (power <= 1);
		
		/** THIS CODE SEGMENT WON'T COMPILE
		 BECAUSE the x in the SYstem.out.println statement
		 is not visible outside the block in which x is declared
		 
		{
			int x=1;
		}
		System.out.println("x="+x);
		*/
		
		int result=number, tally=1;
		do {
			result *= number;
			tally++;
		} while (tally < power);
		IO.outputIntAnswer(result);

	}

}