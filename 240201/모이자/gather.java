import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        int[] sum = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < input; i++) {
            sum[i] = 0;
            for (int j = i; j < input; j++) {
                if (j != i) {
                    sum[i] += arr[j] * (j - i);
                }
            }
            for (int k = 1; k <= i; k++) {
                sum[i] += arr[i - k] * k;
            }
        }
        System.out.println(Arrays.stream(sum).min().orElse(0));
    }
}
/* 정답
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        int[] sum = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < input; i++) {
            sum[i] = 0;
            for (int j = 0; j < input; j++) {
                sum[i] += arr[j] * Math.abs(j - i);
            }
        }
        System.out.println(Arrays.stream(sum).min().orElse(0));
    }
}
*/
