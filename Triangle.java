
public class Triangle {

	public static void main(String[] args) {
		System.out.print("Enter number of lines: ");
		int lines = getInput();
		
		for (int i=1; i <= lines; i++) {
			//system.out.println("i=i);
			//system.out.print("\t");
			printStars(i);
		}
	}
	
	private static void printStars(int line) {
		for (int j=1; j<= line; j++) {
			//system.out.print("j="=j+" ");
			System.out.print("* ");
	}
		System.out.println();
	}
	
	private static int getInput() {
		int number;
		do {
			System.out.print("ENTER NUMBER (>0): ");
			number = IO.readInt();
		} while (number <= 0);
		return number;

}
}
