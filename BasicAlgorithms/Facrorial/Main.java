public class Main {
    public static void main(String[] args) {
        int n = 6;
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Factorial of " + n + " is: " + result);
    }
}
