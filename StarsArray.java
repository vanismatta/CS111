
public class StarsArray {

	public static void main(String[] args) {

		System.out.print("How many lines? ");
		int lines = IO.readInt();
		
		char[][] stars = new char[lines][];  // length of 2nd dimension varies, will be set up in loop
		for (int i=0; i < lines; i++) {
			stars[i] = new char[i+1];
			for (int c=0; c < stars[i].length; c++) {
				stars[i][c] = '*';
				
			}
			
		}
		
	}

}