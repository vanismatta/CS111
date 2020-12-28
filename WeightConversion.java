public class WeightConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float lbs; // declare lbs as a float type variable
		lbs = 72.8f; // force float with f
		
		/*
		 	Use to write multiple comment lines & ignores everything here
		 	
		 	double lbs;
		 	lbs= 7.8; // this will work fine without the f
		 	
		 */
		
		/*
		 Declare and assign in same line:
		 float lbs = 7.8f;
		 */
		
		// compute weight in kgs
		float kgs = lbs / 2.2f;
		
		System.out.println("weight in kgs = " + kgs);
	}

}
