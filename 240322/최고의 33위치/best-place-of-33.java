import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 2 >= n) continue;
                if (j + 2 >= n) continue;

                int cnt = getGoldCnt(i, j, arr);
                max = Math.max(max, cnt);
            }
        }
        System.out.println(max);
    }

    private static int getGoldCnt(int si, int sj, int[][] arr) {

        int cnt = 0;
        for (int i = si; i <= si + 2; i++) {
            for (int j = sj; j <= sj + 2; j++) {
                if (arr[i][j] == 1)
                    cnt++;
            }
        }
        return cnt;
    }
}