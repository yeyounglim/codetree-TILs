import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];

        for(int i=0; i<input; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2);
        for(int i=0; i<input; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i=0; i<input; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}