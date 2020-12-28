public class Cities {

// tells if the city is legit, i.e. only has letters
// and spaces
public static boolean isLegit(String city) {
// trim leading and trailing spaces
city = city.trim();
for (int i=0; i < city.length(); i++) {
char ch = city.charAt(i);
if (!(Character.isLetter(ch) || ch == ' ')) {
return false;
}
}
return city.length() > 0;
}

public static String getCity() {
String prompt = "Enter city name " +
"(letters or spaces only), " +
"'quit' to stop: ";
String city="";
do {
System.out.print(prompt);
city = IO.readString();
} while (!isLegit(city));

return city;
}

public static void main(String[] args) {
// TODO Auto-generated method stub

}

public static void printArray(String[] arr) {
        System.out.print("[");
        if (arr.length > 0) {
                System.out.print(arr[0]);
        }
        for (int i=1; i < arr.length; i++) {
                System.out.print("," + arr[i]);
        }
        System.out.println("]");
}
}