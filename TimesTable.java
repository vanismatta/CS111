public class TimesTable {

	public static void main(String[] args) {
	
		// generate multiplication table
		System.out.print("Enter number of rows: ");
		int rows = IO.readInt();
		
	
		for (int r=1; r <= rows; r++) {
			for (int c=1; c <= 5; c++) {
				System.out.print(r*c + "  ");
			}
			System.out.println();
		}
	
		
		/* WHILE LOOP version */
	/*	
		int r=1;
		while (r <= rows) {
			int c=1;
			while (c <= 5) {
				System.out.print(r*c + "  ");
				c++;
			}
			System.out.println();
			r++;
		}
		*/
	}

}