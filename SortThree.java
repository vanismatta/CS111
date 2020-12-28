public class SortThree {

	public static void main(String[] args) {

		System.out.print("Enter x: ");
		int x = IO.readInt();
		System.out.print("Enter y: ");
		int y = IO.readInt();
		System.out.print("Enter z: ");
		int z = IO.readInt();
		
		if (x < y && x < z) {
			if (y < z) {
				System.out.println(x + "," + y + "," + z);
			} else {
				System.out.println(x + "," + z + "," + y);
			}
		} else if (y < x && y < z) {
			if (x > z) {
				System.out.println(y + "," + z + "," + x);
				
			} else {
				System.out.println(y + "," + x + "," + z);
			}
		} else if (z < x && z < y) {
			if (y < x) {
				System.out.println(z + "," + y + "," + x);
			} else {
				System.out.println(z + "," + x + "," + y);
			}
		}

	}

}