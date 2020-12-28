
public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ask user for number of scores
				System.out.print("Enter number of scores: ");
				int[] scores = new int[IO.readInt()];
				for (int i=0; i < scores.length; i++ ) {
					System.out.print("Input next score (integer): ");
					scores[i] = IO.readInt();
				}

				// print contents of userArray
				System.out.print("[" + scores[0]);
				for (int i=1; i < scores.length; i++) {
					System.out.print(","+scores[i]);
				}
				System.out.println("]");
				
				// find max score
				int max = scores[0];
				// set up sum to compute average
				int sum = scores[0];
				// set up for count of students scoring > 7
				int moreThanSeven=0;
				if (scores[0] > 7) {
					moreThanSeven++;
				}
				// iterate from 2nd through last
				for (int i=1; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
					}
					if (scores[i] > 7) {
						moreThanSeven++;
					}
				}
				System.out.println("max="+max +
									",average="+sum*1.0/scores.length+
									",#scores > 7="+moreThanSeven);
			}	
	}


