
public class MovieRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter rating between 1 and 10: ");
		int rating = IO.readInt();
		
		/** VERSION 1
		// check that rating is between 1 and 10
		if (rating < 1 || rating > 10) {
			IO.reportBadInput();
		} else {
			if (rating <= 3) {
				IO.outputStringAnswer("Bad");
			} else if (rating > 3 && rating <= 6) {
				IO.outputStringAnswer("OK");
			} else if (rating > 6 && rating <= 8) {
				IO.outputStringAnswer("Good");	
			} else {
				IO.outputStringAnswer("Excellent");
			}
		}
		*/
		
		// VERSION 2
		// check that rating is between 1 and 10 
		if (rating < 1 || rating > 10) {
			IO.reportBadInput();
			return; //return from the program (i.e. stop program)
		}
		
		if (rating <= 3) {
			IO.outputStringAnswer("Bad");
		} else if (rating > 3 && rating <= 6) {
			IO.outputStringAnswer("OK");
		} else if (rating > 6 && rating <= 8) {
			IO.outputStringAnswer("Good");	
		} else {
			IO.outputStringAnswer("Excellent");
			
		}

	}

}
