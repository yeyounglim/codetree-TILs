import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char result = 'F';
        int emer = 0;

        for (int i = 0; i < 3; i++) {
            char c = sc.next().charAt(0);
            int fever = sc.nextInt();

            switch (c) {
                case 'Y':
                    result = (fever >= 37) ? 'A' : 'C';
                    break;
                case 'N':
                    result = (fever >= 37) ? 'B' : 'D';
                    break;
            }
            if (result == 'A')
                emer++;
        }
        System.out.println(emer >= 2 ? 'E' : 'N');
    }
}