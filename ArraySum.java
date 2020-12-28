public class ArraySum {
	 public static void main(String args[] )
	  {
	      
	      int[] inputArray = {1, -24, 9, 345, 176, 78, -7};
	      int sum = arraySum(inputArray);
	      System.out.println(sum);
	  }
	public static int arraySum(int [] sumArray) {
		
		int sum=0;

		for(int i=0; i<sumArray.length; i++) {
		sum+=sumArray[i];
		
		}
		return sum;
		}
}