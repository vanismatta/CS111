
public class PayFee {

	public static void main(String[] args) {

			double fee=0;
			double percent;
			
			double payments;
			System.out.println("please enter the payement amount in dollars: ");
			payments=IO.readDouble();
			
		
			if(payments<=500) {
				fee=10;
				}
			else if(payments>500 && payments<5000) {
				percent=payments*0.01;
			
				if(percent>20.0) {
					fee=percent;
					}
			
				else {
					fee=20;
					}
				}

			else if(payments>5000 && payments<10000) {
				percent=payments*0.02;
			
				if(percent>120) {
					fee=percent;
					}
			else {
				fee=120;
					}
				}

			if(payments>=10000) {

			double first=10000*0.02;
			double remainder=payments-10000;
			
			if(remainder>=5000) {
				double second=5000*0.03;
				remainder=remainder-5000;
				
				double third= remainder*0.04;
				fee=first+second+third;

				}

			}

			IO.outputDoubleAnswer(fee);
}
}
