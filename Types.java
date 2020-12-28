
public class Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y=x;
		System.out.println(y);
		
		float z=1.2f;  // 'f' after 1.2 makes it a float
		
		//x=z; => type mismatch, will lose fractional part
		
		
		int sum = 2+3+4+5;
		
		/* 
		 * THE FOLLOWING DOESN'T WORK BECAUSE BOTH OPERANDS
		 * sum and 4 are ints, so it does INTEGER ARITHMETIC
		 * which results in the fractional part being discarded
		 * AND THEN it assigns the result to average
		float average=sum/4;
		*/
		
		
		float average = sum/4f;  // FORCES 4 to be of type float
		System.out.println("average = " + average); 
		
		// OR, you can do: average = sum*1.0f/4;
		// average = sum*1/4f; => same as sum/4f
		
		double sum2 = 2+3+4+5;
		double average2 = sum2/4;
		System.out.println("average2="+average2);
		
		// CASTING
		x = (int)average;   // FORCES average to be CAST to an int, lose fractional part
		System.out.println("x = " + x);
		
		average=(float)sum/4;   // CAST sum to float, then divide by 4
		System.out.println("average = " + average); 
		
		average=(float)(sum*1.0/4);
		System.out.println("average = " + average); 
		
		int biggestInt = Integer.MAX_VALUE;
		System.out.println("biggest integer = " + biggestInt);
		
		System.out.println("biggest long integer = " + Long.MAX_VALUE);
		
		System.out.println("biggest float = " + Float.MAX_VALUE);
		
		// character type
		char c='x';   // CHARACTER CONSTANT is a single character within SINGLE QUOTES
		
		// char d="y"; => WON'T WORK, anything in double quotes is a String type
		// char d=(char)"y";   => WON'T WORK because String cannot be cast to char
		
		boolean t=true;   // boolean constants are true and false
		System.out.println("t="+t);
		
		boolean f=false;
		boolean tandf = t && f;   // AND
		System.out.println("tandf="+tandf);
		
		boolean torf = t || f;   // OR
		System.out.println("torf="+torf);
		
		char ch = 'A';
		int chval = (int)ch;
		System.out.println("numeric code for A = " + chval);
		System.out.println("numeric code for a = " + (int)'a');
		
		int chval2 = chval + 1; // adding 1 to 'A's numeric code. should give B
		char ch2 = (char)chval2; // cast code to character
		System.out.println("character with code 66 = " + ch2);	
	}

}
