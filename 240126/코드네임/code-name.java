import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char user;
        int lv;
        Data[] data = new Data[5];
        int compare = 0;
        int flag = 0;
        for (int i = 0; i<5; i++) {
            user = sc.next().charAt(0);
            lv = sc.nextInt();
            data[i] = new Data(user, lv);
        }
        compare = data[0].lv;
        for (int i = 0; i<5; i++) {
            if(compare > data[i].lv) {
                compare = data[i].lv;
                flag = i;
            }
        }
        System.out.print(data[flag].user + " " + data[flag].lv);
    }
}
class Data {
    char user;
    int lv;

    public Data(char user, int lv) {
        this.user = user;
        this.lv = lv;
    }
}