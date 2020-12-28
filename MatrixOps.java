public class MatrixOps
{
	public static double[][] multiply(double[][] matrixA, double[][] matrixB)
	{
		int rowOne = matrixA.length;
		int rowTwo = matrixB.length;
		int columnOne = matrixA[0].length;
		int columnTwo = matrixB[0].length;
		
		
		double[][] matrixC = new double[matrixA.length][matrixB[0].length];
		
		
		if ( columnOne != rowTwo ) {
		    System.out.println("Matrix does not match");
		    return null;
		  }
		
		for(int i = 0; i < rowOne; i++){
			for(int j = 0; j < columnTwo; j++){
				for(int k = 0; k < columnOne; k++){
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		
		return matrixC;
	}
}