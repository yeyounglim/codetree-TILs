import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result;
        int[] midArr = new int[arr.length / 2 + 1];

        int cnt = 0;
        for (int i = 1; i < input + 1; i++) {
            result = Arrays.copyOf(arr, i);
            if (i % 2 != 0) {
                Arrays.sort(result);
                midArr[cnt] = result[i / 2];
                cnt++;
            }
        }

        for (int i = 0; i < midArr.length; i++) {
            System.out.print(midArr[i] + " ");
        }

        /* 
        //풀이 정답
        for (int i = 0; i < input; i++) {
            if (i % 2 == 0) {
                Arrays.sort(arr, 0, i + 1);
                System.out.print(arr[i / 2] + " ");
            }
        }
        */
    }
}
