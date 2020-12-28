public class TrainTicket {

	public static void main(String[] args) {
		
		double seniorPrice;
		double adultPrice;
			System.out.println("Is this person a senior? ");
			boolean senior = IO.readBoolean();
			
			System.out.println("Was this ticket type bought on board the train?");
			boolean onBoard = IO.readBoolean(); 
			
				if (onBoard == true) {
					if (senior) {
						seniorPrice = ((6.50 * .10) + 6.50);
						IO.outputDoubleAnswer(seniorPrice);
						
					}
					else {
						adultPrice= ((11.50*.10)+11.50);
						IO.outputDoubleAnswer(adultPrice);	
	}
				}
				else  {
					if (senior) {
						seniorPrice = (6.50);
					IO.outputDoubleAnswer(seniorPrice);
					}
					else {	
						adultPrice= (11.50);
						IO.outputDoubleAnswer(adultPrice);	
						
					}
				}
				
			}
	}

