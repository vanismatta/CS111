
public class ForMyNotes {

	public static void main(String[] args) {
		double farenheit = 44;
		
		if (farenheit < -457.67) {
			System.out.println("farenheit must be >= -457.67");
		} else {
			double celcius = (farenheit-32)*5/9;
			System.out.println("celcius=" + celcius);
		
		}

	}
	
	
}

