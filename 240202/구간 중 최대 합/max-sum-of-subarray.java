import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < k; i++) {
            sum[i] = 0;
            for (int j = i; j < k + i; j++) {
                sum[i] += arr[j];
            }
        }
        System.out.println(Arrays.stream(sum).max().orElse(0));
    }
}