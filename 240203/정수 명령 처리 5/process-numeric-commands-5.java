import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();

            if ("push_back".equals(cmd)) {
                int value = sc.nextInt();
                list.add(value);
            }
            if ("pop_back".equals(cmd)) {
                list.remove(list.size() - 1);
            }
            if ("size".equals(cmd)) {
                System.out.println(list.size());
            }
            if ("get".equals(cmd)) {
                int value = sc.nextInt();
                System.out.println(list.get(value - 1));
            }
        }
    }
}