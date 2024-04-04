import java.util.*;
public class Main {
    static int n;
    static ArrayList<Integer> answer = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n + 1];
        choose(1);
    }

    private static void choose(int current) {
        if (current == n + 1) {
            print();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            answer.add(i);
            choose(current + 1);
            answer.remove(answer.size() - 1);
            visited[i] = false;
        }
    }

    private static void print() {
        answer.forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}