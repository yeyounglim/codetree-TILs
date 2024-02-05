import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();

            if("push_front".equals(cmd)){
                int num=sc.nextInt();
                list.addFirst(num);
            }
            if ("push_back".equals(cmd)) {
                int num=sc.nextInt();
                list.addLast(num);
            }
            if ("pop_front".equals(cmd)) {
                System.out.println(list.pollFirst());
            }
            if ("pop_back".equals(cmd)) {
                System.out.println(list.pollLast());
            }
            if ("size".equals(cmd)) {
                System.out.println(list.size());
            }
            if ("empty".equals(cmd)) {
                System.out.println(list.isEmpty() ? 1 : 0);
            }
            if ("front".equals(cmd)) {
                System.out.println(list.peekFirst());
            }
            if ("back".equals(cmd)) {
                System.out.println(list.peekLast());
            }
        }
    }
}