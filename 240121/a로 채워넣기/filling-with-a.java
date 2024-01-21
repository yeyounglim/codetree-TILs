import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] c = input.toCharArray();

        c[1] = 'a';
        c[c.length - 2] = 'a';

        System.out.println(String.valueOf(c));
    }
}