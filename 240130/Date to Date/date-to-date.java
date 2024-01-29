import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //                                1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 11. 12.
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int day1 = 0;

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int day2 = 0;

        int sum = 0;

        day1 = num_of_days[m1] - d1 + 1;
        if (m1 < m2) {
            for (int i = m1 + 1; i < m2; i++) {
                sum += num_of_days[i];
            }
            sum += day1 + d2;
        } else if (m1 == m2) {
            sum += d2 - d1;
        }

        System.out.println(sum);
    }
}