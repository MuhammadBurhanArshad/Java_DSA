package BasicAlgorithms;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of " + str + ":");
        permute(str, "");
    }

    public static void permute(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, prefix + ch);
        }
    }
}
