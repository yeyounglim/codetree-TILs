import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        char dir;
        int d;
        int[] dx = new int[input];
        int[] dy = new int[input];
        int ny = 0, nx = 0;

        for (int i = 0; i < input; i++) {
            dir = sc.next().charAt(0);
            d = sc.nextInt();

            switch (dir) {
                case 'N': dy[i] = d; break;
                case 'E': dx[i] = d; break;
                case 'W': dx[i] = -d; break;
                case 'S': dy[i] = -d; break;
            }
            nx += dx[i];
            ny += dy[i];
        }
        System.out.println(nx + " " + ny);
    }
}