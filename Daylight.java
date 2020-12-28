
public class Daylight {

	public static void main(String[] args) {
		System.out.print("Enter sunrise hour: ");
		int sunriseHour = IO.readInt();
		System.out.print("Enter sunrise minute: ");
		int sunriseMinute = IO.readInt();
		System.out.print("Enter sunset hour: ");
		int sunsetHour = IO.readInt();
		System.out.print("Enter sunset minute: ");
		int sunsetMinute = IO.readInt();
		
		int sunriseTime = sunriseHour * 60 + sunriseMinute;
		int sunsetTime= (sunsetHour+12) * 60 + sunsetMinute;
		int difference = sunsetTime - sunriseTime;
		int daylightHours = difference / 60; //INTEGER DIVISION!!! Truncates fractional 
		int daylightMinutes = difference % 60; // % is for modulus
		
		
		//Using System.out.println for output because I want the 
		//output to be verbose
		//DONT USE this for assignments, ALWAYS USE I0.output...
		
	    /*
		System.out.println("Daylight hours = " + daylightHours);
		System.out.println("Daylight minutes = " + daylightMinutes);
		*/
		System.out.println("Daylight duration is " 
		                   + daylightHours + "hours, " 
				           +daylightMinutes + "Minutes");
		
		
		
		
		
	}

}
