import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg = 0;
        double[] input = new double[8];
        for (int i = 0; i < 8; i++) {
            input[i] = sc.nextDouble();
            avg += input[i];
        }
        System.out.printf("%.1f", avg / 8);
    }
}