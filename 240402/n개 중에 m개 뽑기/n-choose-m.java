import java.util.*;

public class Main {
    static int n;
    static int m;
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        choose(1, 0);
    }

    private static void choose(int current, int cnt) {
        if (cnt == m) {
            print();
            return;
        }
        for (int i = current; i <= n; i++) {
            answer.add(i);
            choose(i + 1, cnt + 1);
            answer.remove(answer.size() - 1);
        }
    }

    private static void print() {
        answer.forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}