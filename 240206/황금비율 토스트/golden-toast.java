import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        LinkedList<Character> bread = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            bread.add(str.charAt(i));
        }
        ListIterator l = bread.listIterator(bread.size());

        for (int i = 0; i < m; i++) {
            String c = sc.next();
            if ("L".equals(c)) {
                if (l.hasPrevious()) {
                    l.previous();
                }
            }
            if ("R".equals(c)) {
                if (l.hasNext()) {
                    l.next();
                }
            }
            if ("D".equals(c)) {
                if (l.hasNext()) {
                    l.next();
                    l.remove();
                }
            }
            if ("P".equals(c)) {
                char in = sc.next().charAt(0);
                l.add(in);
            }
        }
        System.out.println(bread.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}