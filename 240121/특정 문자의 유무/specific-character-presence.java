import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.contains("ee")){
            System.out.print("Yes ");
        } 
        else System.out.print("No ");
        if(input.contains("ab")){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}