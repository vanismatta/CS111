
public class Census {

	public static void main(String[] args) {
	
		int numAppt;
		int totChildren = 0;
		int totSeniors = 0;
		int totAdults = 0;
		
		System.out.println("How many appartments are in the complex?");
			numAppt = IO.readInt();
		
			int count = 1;
			
				while (count<=numAppt) {
					System.out.println("how many children do you have in appartment " + count);
					int numChildren = IO.readInt();
					totChildren=totChildren+numChildren;
					
					System.out.println("how many seniors do you have in the appartment " + count);
					int numSeniors = IO.readInt();
					totSeniors=totSeniors+numSeniors;
					
					System.out.println("how many adults	 do you have in the appartment " + count);
					int numAdults = IO.readInt();
					totAdults=totAdults+numAdults; 
					count = count + 1;
		}
				IO.outputIntAnswer(totChildren);
				IO.outputIntAnswer(totSeniors);
				IO.outputIntAnswer(totAdults);
				IO.outputDoubleAnswer((double) totChildren/numAppt);
				IO.outputDoubleAnswer((double) totSeniors/numAppt);
				IO.outputDoubleAnswer((double) totAdults/numAppt);
				
	
	}
}
