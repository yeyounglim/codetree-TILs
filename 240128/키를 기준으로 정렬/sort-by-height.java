import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        People[] people = new People[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new People(name, height, weight);
        }
        Arrays.sort(people, (a, b) -> a.height - b.height);

        for (int i = 0; i < n; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight);
        }
    }
}

class People {
    int height, weight;
    String name;

    public People(String name, int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }
}