import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(2) == input || arr[i].charAt(3) == input) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(cnt);
    }
}