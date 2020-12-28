public class BuyingTomatoes {

	public static void main(String[] args) {
		System.out.println("Enter number of pounds");
		double weightInPounds = IO.readDouble();
		System.out.println("Enter cost per pound");
		double pricePerPound = IO.readDouble();

	if (weightInPounds < 0||pricePerPound < 0) {
		IO.reportBadInput(); }
	else {
		double costInDollars=pricePerPound*weightInPounds;
		IO.outputDoubleAnswer(costInDollars);
		
	}
		
		
	}

}
