import java.util.*;

public class Main {
    static int n;
    static int k;
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        choose(1);
    }

    private static void choose(int current) {
        if (current == n + 1) {
            print();
            return;
        }
        for (int i =1; i <= k; i++) {
            if (answer.size() >= 2
                    && i == answer.get(answer.size() - 1)
                    && i == answer.get(answer.size() - 2))
                continue;
            answer.add(i);
            choose(current + 1);
            answer.remove(answer.size() - 1);
        }
    }

    private static void print() {
        answer.forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}