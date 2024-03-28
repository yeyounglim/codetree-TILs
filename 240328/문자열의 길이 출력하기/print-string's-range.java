import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            String str = sc.next();
            sum += str.length();
            
        }
        System.out.println(sum);
    }
}