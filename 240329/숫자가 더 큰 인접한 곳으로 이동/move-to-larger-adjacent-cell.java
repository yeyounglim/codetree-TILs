import java.util.*;

public class Main {
    static int sn;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sn = n;
        int[][] arr = new int[n][n];

        int[] visit = new int[n * n];

        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Pair p = new Pair(r, c);
        visit[0] = arr[r][c];

        int max = visit[0];
        int cnt = 1;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};// 상하좌우

        boolean moved;
        do {
            moved = false;
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (inRange(nx, ny) && arr[nx][ny] > max) {
                    max = arr[nx][ny];
                    visit[cnt] = max;

                    p.setXY(nx, ny);
                    moved = true;
                    cnt++;
                    break;
                }
            }
        } while (moved);

        for (int i = 0; i < cnt; i++) {
            System.out.print(visit[i] + " ");
        }

    }
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < sn && 0 <= y && y < sn;
    }
}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}