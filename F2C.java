
public class F2C {

	public static void main(String[] args) {
		
		float fahrenheit = 44;
		//float fahrenheit = -600;
		
		
		if (fahrenheit < -457.67) {
			System.out.println("fahrenheit must be >= -457.67");
		} else {
			float celsius = (fahrenheit - 32)*5/9;
			System.out.println("celsius="+ celsius);
		}
		
		
		/*
		THIS WONT WORK because 5/9 gives 0 - "integer" division
		float celcius = (fahrenheit -32)*(5/9);
		System.out.println(celsius = " + celsius);")
		*/
		
	} 
	
	
}
