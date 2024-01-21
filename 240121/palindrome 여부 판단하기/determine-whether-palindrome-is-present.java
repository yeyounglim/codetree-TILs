import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        palindrome(input);
    }

    public static void palindrome(String s) {
        char[] c = s.toCharArray();
        int mid = c.length / 2;
        String flag = "";
        for (int i = 0; i < mid; i++) {
            if (c[i] != c[c.length - 1 - i]) {
                flag = "No";
                break;
            } else
                flag = "Yes";
        }
        System.out.println(flag);
    }
}