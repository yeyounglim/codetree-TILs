import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        extracted(s1, e1, arr, n, new int[n]);

        extracted(s2, e2, arr, n, new int[n]);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                cnt++;
        }
        
        System.out.println(cnt);

        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void extracted(int s, int e, int[] arr, int n, int[] tmp) {
        int t = 0;
        for (int i = s - 1; i < e; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                tmp[t] = arr[i];
                t++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = tmp[i];
        }
    }
}