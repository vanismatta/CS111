public class Occurrences
{
  public static int occurrences(double target, double[][] array)
  {
      int count=0;
      for (int n=0; n<array.length;n++) {
    	  for (int m=0;m<array[n].length;m++) {
    		  if (array[n][m]==target) {
    			  count++;
    			 
    		  }
    	  }
      }
      return count;
  }
}