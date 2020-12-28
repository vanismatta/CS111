public class TwoSmallest {
public static void main(String[] args) {
		System.out.println("Enter a terminating value, followed by a series of numbers");
		double halt=IO.readDouble();
		double number;
		double smallest1=Double.MAX_VALUE;
		double smallest2=Double.MAX_VALUE; 
		int count=0;
		
		while (true) {
		 number=IO.readDouble();
		 	if(number==halt) {
		 		if(count<2) {
		 			IO.reportBadInput();
		 			continue;
		 }
		 	else break;
		 }
		 	
		 if(number<smallest1) {
			 smallest2=smallest1;
			 smallest1=number;
		 }
		
		 else if(number<smallest2) {
			 smallest2=number;
		 }
		 	count++;
		 }
		
		 IO.outputDoubleAnswer(smallest1);
		 IO.outputDoubleAnswer(smallest2);
		}		
}
