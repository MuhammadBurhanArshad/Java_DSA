package BasicAlgorithms;

public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(n + " is a palindrome? " + isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int start = 0;
        int end = digits.length - 1;

        while (start < end) {
            if (digits[start] != digits[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
