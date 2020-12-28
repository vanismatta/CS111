
public class ExamScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of exams: ");
		int exams=IO.readInt();
		System.out.print("enter number of students: ");
		int students=IO.readInt();
		int[][] scores=new int[students][exams];
		
		for (int s=0; s< scores.length; s++) { //.lenth means number of rows or columns?
			System.out.println("enter scores for next student");
			for (int e=0; e< scores[s].length; e++) {
				System.out.print("\tEnter exam score: ");
				scores[s][e]=IO.readInt();
				
			}
		}
		for (int e=0; e<scores[0].length;e++) { //iterate through colums
			int sum=0;
			int max=Integer.MIN_VALUE; //smallest int value that can be stored in the program
			int min=Integer.MAX_VALUE; //largest int value that can be stored in the program
			for (int s=0; s< scores.length; s++) { //for each column, iterate through rows
				sum += scores[s][e];
				if (scores[s][e]> max) {
					max=scores[s][e];
					
				}
				if (scores[s][e]<min) {
					min=scores[s][e];
				}
			}
			System.out.println("average="+sum*1f/students+",min="+min+",max="+max);
		}
	}
}
