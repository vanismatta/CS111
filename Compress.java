public class Compress {

  public static void main(String[] args) {
    System.out.println("r: " + compress("r"));
    System.out.println("zzzzzzzz: " + compress("zzzzzzzz"));
    System.out.println("ab: " + compress("ab"));
  }

    public static String compress (String str) {

    	int counter=1;
    	String ans="";
    		for(int i=0; i<str.length(); i++) {
    	for(int j=i+1; j<str.length(); j++) {

    		if(str.charAt(i)==str.charAt(j)){

    		counter ++;
    	}

    	else {break;}
    	}

    	if(counter>1) {

    	ans+=counter +Character.toString(str.charAt(i));


    	}
    	else {

    	ans+=Character.toString(str.charAt(i));

    }

    	str=str.substring(counter-1);
    	counter=1;





    	}
 return ans;
  }
}