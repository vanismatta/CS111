
public class Tuition {

	public static void main(String[] args) {
		double creditCost = 35;
		
		double total = 5.75;

			System.out.println("How many credits is the student taking this semester? ");
			int numCredit = IO.readInt();
			
			System.out.println("Is the student a university employee? ");
			boolean universityEmployee = IO.readBoolean();
			
			System.out.println("Is the student a state employee? ");
			boolean stateEmployee = IO.readBoolean();
		
			System.out.println(" Are payments to be made in installments? ");
			boolean installments = IO.readBoolean();
			
			if (numCredit < 0) {
				IO.reportBadInput();
				}
			
			else  {
					total = 5.75;
					creditCost = numCredit* 35;	
					
					if (stateEmployee==true) {
						total= total +(creditCost *0.20);
					}
					else if (universityEmployee==false) {
						total= total +creditCost;
					}
				if (installments==true) {
					total= total +(total*0.02);
			}	
				
}
	        IO.outputDoubleAnswer(total);
	}
	}