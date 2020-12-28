public class Mystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of lines: ");
		int lines = IO.readInt();

		/*
		for (int i=1; i <= lines; i++) {
			//System.out.println("i="+i);
			//System.out.print("\t");
			for (int j=1; j <= i; j++) {
				//System.out.print("j="+j+"  ");
				//System.out.print("* ");
			}
			System.out.println();
		}
		
		*/
		for (int i=1; i <= lines; i++) {
			//System.out.println("i="+i);
			//System.out.print("\t");
			for (int j=lines; j >= i; j--) {
				//System.out.print("j="+j+"  ");
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}