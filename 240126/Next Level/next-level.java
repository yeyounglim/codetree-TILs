import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        int lv = sc.nextInt();

        Data data1 = new Data();
        System.out.println("user " + data1.user + " lv " + data1.lv);
        Data data2 = new Data(user, lv);
        System.out.println("user " + data2.user + " lv " + data2.lv);
    }
}
class Data {
    String user;
    int lv;

    public Data() {
        this.user = "codetree";
        this.lv = 10;
    }
    public Data(String user, int lv) {
        this.user = user;
        this.lv = lv;
    }
}