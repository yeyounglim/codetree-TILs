import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String s2 = sc.next();

        if (s.length() > s2.length()) {
            System.out.println(s + " " + s.length());
        } else if (s.length() < s2.length()) {
            System.out.println(s2 + " " + s2.length());
        } else
            System.out.println("same");
    }
}