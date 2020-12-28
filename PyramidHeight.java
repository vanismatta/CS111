
public class PyramidHeight {

	public static void main(String[] args) {
		System.out.print("Enter height int");
		int height=IO.readInt();
		pyramid(height);
		
	}

	
	public static void printRow (int stars) {
		if (stars==0) {
			System.out.println();
			return;
		}
		System.out.print("*");
		printRow (stars-1);
		
	}
	
	public static void pyramid (int height) {
		if (height==0) {
			return;
		}
	pyramid(height-1); //if you want to do the pyramid upside down switch these two
	printRow(height);
}
}
// This is recursion using methods
// The 3 attributes include: 1) Calls itself, 2) has termination case, 3) Modifies input
//Make sure you know summation