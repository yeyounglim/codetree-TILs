import java.util.*;

public class Main {
    static int n;
    static ArrayList<Integer> answer = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n];
        choose(n);
    }

    private static void choose(int current) {
        if (current == 0) {
            print();
            return;
        }
        int vi = 0;
        for (int i = n; i >= 1; i--) {
            vi = n - i;
            if (visited[vi])
                continue;

            visited[vi] = true;
            answer.add(i);
            choose(current - 1);
            answer.remove(answer.size() - 1);
            visited[vi] = false;
        }
    }

    private static void print() {
        answer.forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}