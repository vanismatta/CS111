
public class Nnumbers {

	public static void main(String[] args) {
	
		int n;
		int sum=0;
	// how many numbers will we have?	
	System.out.print("How many numbers?");	
	n = IO.readInt();
	

	//Array
	int array[]=new int[n];
	
	System.out.println("enter the " +n +" numbers");
	

	//Loop
		for (int i=0;i<array.length;i++) {
			if (i % 2==1) {
			System.out.println ("enter number" + (i+1) + ":");
			
	}
	
	
	/* else {
			
				System.out.print("enter number: ");
				int num= IO.readInt();
				n--;
				
		
			if (num%2 !=0) {
				IO.reportBadInput();
			}
			else {	
			
				for (int i=1;i<=n;i++) {
					sum=num+num;
					IO.outputIntAnswer(sum);
				}
				
			
			}
		
	*/	
	}
}
}


