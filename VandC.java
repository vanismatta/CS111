
public class VandC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter text string: ");;
		String text =IO.readString();
		int vowels=0, consonants=0;
		for (int i=0; i< text.length(); i++) { //iterate through chars in string
			char ch=text.charAt(i);
			//skip over non-letters
			if (!Character.isLetter(ch)) {
				continue; //move on to the next iteration
			}
			ch=Character.toLowerCase(ch); //covert to lower case
			if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			} else {
				consonants++;
			}
	
		}
		System.out.println("vowels="+vowels+",consonants="+consonants);
	}
	
}


