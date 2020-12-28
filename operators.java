
public class operators {

	public static void main(String[] args) {
		int result = 1+2;
		System.out.println("1+2=" + result);
		
		int previousResult = result;
		
		result = result -1;
		System.out.println(previousResult+ "-1 =" + result);
		
		previousResult = result;
		
		result = result * 10;
		System.out.println(previousResult + "* 10 =" + result);
		
		result = result / 5;
		System.out.println(previousResult + "/5=" + result);
		
		previousResult = result;
		result = result % 3;
		System.out.println(previousResult + "% 3 =" + result);
		
		previousResult = result;
		result = result + 1;
		System.out.println("Result is now" + result);
		result++;
		System.out.println("Result is now" + result);
		result--;
		System.out.println("Result is now" + result);
		
		result+= 2;
		System.out.println("Result is now" + result);
		result*=10;
		System.out.println("Result is now" + result);
		result-= 10;
		System.out.println("Result is now" + result);
		result/= 10;
		System.out.println("Result is now" + result);

		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("It is not an alien!");
		else isAlien= true;
			System.out.println("It is an Alien");
			
		int topScore = 80;
		if (topScore < 100)
			System.out.println("You got the high score!");
		
		int secondTopScore = 81;
		if ((topScore > secondTopScore) && (topScore < 100))
			System.out.println("Greater than second top score and less then 100");


		if ((topScore > 90) || (secondTopScore <= 90))
		// || is OR operator
			System.out.println("One of these tests is true");
		
		int newValue = 50;
		if(newValue == 50)
			System.out.println("This is true");
		// we need a boolean to test the if. to test it ==
		
		boolean isCar = false;
		if(isCar == true)
			System.out.println("This is not supposed to happen");

		isCar = true;
		boolean wasCar = isCar ? true : false;
		// if isCar == true than wasCar = true otherwise = false
		//turnery operator ?
		if (wasCar)
			System.out.println("wasCar is true");

		
		//CHALLENGE//
		//1. Create a double variable with the value of 20
		//2. Create a double variable of type double with value of 80
		//3. Add both numbers up and multiply by 25
		//4. Use the remainder operator to figure out the remainder from the sum of #3/40
		//5. Write an "if" statement that displays a message "Total was over the limit"
		//	if the remaining total (#4) is equal to 20 or less.
	}
		double ticketOne=20d;
		double ticketTwo=80;
		double total= (ticketOne + ticketTwo) * 25;
		System.out.println(("total =") + total); //por que?
		double remainder = total % 40;
		if (remainder <= 20)
			System.out.println("total was over the limit");
		
			
				
		}
}
			
		
				
				

