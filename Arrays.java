
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare an int array
		int[] intA;
		
		// allocate space for array items
		intA = new int[5];   // allocate length 5
		
		// assign ints to cells/locations of aray
		intA[0] = 1;
		intA[1] = 2;
		intA[2] = 10;
		intA[3] = 8;
		intA[4] = 7;
		
		// intA[5] = 10;  // will NOT create new space to accommodate 10, error to use
		                  // index 5 because it is out of bounds since max index is 4
		
		// you can do all of the above in one line
		int[] intB = new int[] { 1, 2, 10, 8, 7};
		
		double[] doubleX = new double[] {1.2,3.4,5.6,7.8};
		
		// set array length as required by user input
		int[] userArray;
		System.out.print("Enter array length: ");
		int len = IO.readInt();
		userArray = new int[len];
		for (int i=0; i < len; i++) {
			userArray[i] = i+1;
		}
		
		// print contents of userArray
		System.out.print("[" + userArray[0]);
		for (int i=1; i < len; i++) {
			System.out.print(","+userArray[i]);
		}
		System.out.println("]");

	}

}