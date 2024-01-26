import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] arr = new String[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        for (int i = 0; i < input; i++) {
            System.out.println(arr[i]);
        }
    }
}