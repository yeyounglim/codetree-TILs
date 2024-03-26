import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int line = 2;
        int[][] arr = new int[line][n];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int k = 0; k < t; k++) {
            int tmp = arr[1][n-1];
            int tmp2 = arr[0][n-1];
            for (int i = 0; i < line; i++) {
                for (int j = n - 1; j >= 1; j--) {
                    arr[i][j] = arr[i][j-1];
                }
                arr[i][0] =tmp2;
            }
            arr[0][0] = tmp;
        }

        for (int i = 0; i < line; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}