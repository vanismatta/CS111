public class AppendRec {

  public static void main (String[] args) {
    System.out.println(appendNTimes("tea", 0));
    System.out.println(appendNTimes("t", 0));
    System.out.println(appendNTimes("tea", 1));
    System.out.println(appendNTimes("tea", 4));
  }

 public static String appendNTimes (String str, int n) {

if(n<0)
{
return "";
}

 return str+ appendNTimes(str,n-1);
  }
}