import java.util.*;

class Trie {
    Trie[] child = new Trie[10];
    boolean isEnd;

    public Trie() {
        isEnd = false;
        for (int i = 0; i < 10; i++) 
            child[i] = null;
    }
}

public class Main {

    public static int n;
    public static String[] nums;
    public static Trie root = new Trie();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums = new String[n];
        for (int i = 0; i < n; i++) 
            nums[i] = sc.next();
        
        int last = 1;
        for (int i = 0; i < n; i++) {
            boolean result = insert(nums[i]);
            if (result) {
                last = 0;
                break;
            }
        }
        System.out.println(last);
    }

    public static boolean insert(String num) {
        Trie t = root;
        for (int i = 0; i < num.length(); i++) {
            int idx = num.charAt(i) - '0';
            if (null == t.child[idx]) 
                t.child[idx] = new Trie();
            
            t = t.child[idx];
            if (t.isEnd)
                return true;
        }
        t.isEnd = true;
        return false;
    }
}