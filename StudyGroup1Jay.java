
public class StudyGroup1Jay {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("how many numbers? ");
		int n=IO.readInt();
		//int max=0; it doesn work if all the numbers are negative
		System.out.print("Enter the number ");
		int max=IO.readInt();
		for(int i=1; i<n; i++) //we wont use i<=n because it will do an extra step since we asked one time before the loop
		{
		    System.out.print("Enter the number ");
		    int num=IO.readInt();

		    if(num>max) {

		    	max=num;

		}

		}

		System.out.print("max is : "+max);
		}
		}