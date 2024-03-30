import java.util.*;

public class Main {
    static int n;
    static int k;
    static Stack<Integer> answer = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kk = sc.nextInt();
        int nn = sc.nextInt();
        k = kk;
        n = nn;
        choose(1);

    }

    private static void choose(int current) {
        if (current == n + 1) {
            print();
            return;
        }
        for (int i = 1; i <= k; i++) {
            answer.push(i);
            choose(current + 1);
            answer.pop();
        }

    }

    private static void print() {
        answer.forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}