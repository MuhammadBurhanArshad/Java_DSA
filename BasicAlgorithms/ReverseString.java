package BasicAlgorithms;

public class ReverseString {
    public static void main(String[] args) 
    {
        String str = "hello";
        System.out.println(
            "Reversed string is: " + reverse(str));
        }

    public static String reverse(String str) 
    {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
