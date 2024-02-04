import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if ((a - 2 <= k && k <= a + 2) || (b - 2 <= j && j <= b + 2) || (c - 2 <= i && i <= c + 2)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}