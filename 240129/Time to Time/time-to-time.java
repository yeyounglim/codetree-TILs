import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int time1 = 0;

        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int time2 = 0;

        time1 = h1 * 60 + m1;
        time2 = h2 * 60 + m2;

        System.out.println(time2 - time1);
    }
}