import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printWord(n));
    }
    public static int printWord(int n){
        if(n == 1)
            return 1;
        int sum = 0;
        sum += n;
        return sum + printWord(n-1);
    }
}