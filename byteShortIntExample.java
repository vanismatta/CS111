
public class byteShortIntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. create a byte variable and set it to any valid byte number.
		//2. Create a short variable and set it to any valid short number.
		//3. Create a int variable and set it to any valid int number.
		//4. Create a variable of type long, and make it equal to
		//		50000 +10 times the sum of the byte, plus the short plus the int
		
		byte myFirstNumber = 10;
		short mySecondNumber = 20;
		int myThirdNumber = 50;
		long longTotal = 50000L+10L * (myFirstNumber + mySecondNumber + myThirdNumber);
		short shortTotal = (short) (1000 + 10* (myFirstNumber + mySecondNumber + myThirdNumber));
		System.out.println("longTotal =" + longTotal);
		System.out.println("shortTotal =" + shortTotal);
		
		//Remember to put parenthesis before casting 
		
		
		
	}

}
