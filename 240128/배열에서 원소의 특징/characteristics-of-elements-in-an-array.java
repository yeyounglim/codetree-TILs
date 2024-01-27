import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            myArray[i] = sc.nextInt();
            if (myArray[i] % 3 == 0) {
                System.out.println(myArray[i - 1]);
                break;
            }
        }
    }
}