
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set up a 2D array for multiplication table
				System.out.print("How many rows? ");
				int rows = IO.readInt();
				System.out.print("How many columns? ");
				int cols = IO.readInt();
				
				int[][] multTable = new int[rows][cols];
				for (int r=0; r < rows; r++) {
					for (int c=0; c < cols; c++) {
						multTable[r][c] = (r+1)*(c+1); 
					}
				}
				
				for (int r=0; r < multTable.length; r++) { // multTable.length is number of rows
					System.out.print("[" + multTable[r][0]);
					for (int c=1; c < multTable[r].length; c++) { // multTable[r].length is number of columns
																  // in row indexed by r
						System.out.print(","+multTable[r][c]);
					}
					System.out.println("]");
				}
			}
	}


