import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        char mettingPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        
        Data data = new Data(secretCode, mettingPoint, time);
        System.out.println("secret code : " + data.secretCode);
        System.out.println("meeting point : " + data.mettingPoint);
        System.out.println("time : " + data.time);
    }
}

class Data {
    String secretCode;
    char mettingPoint;
    int time;

    public Data(String secretCode, char mettingPoint, int time) {
        this.secretCode = secretCode;
        this.mettingPoint = mettingPoint;
        this.time = time;
    }
}