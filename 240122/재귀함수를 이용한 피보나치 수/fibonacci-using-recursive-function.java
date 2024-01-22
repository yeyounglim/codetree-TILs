import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 2) + fibo(n - 1);
    }
}