import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            student[i] = new Student(h, w, i + 1);
        }

        Arrays.sort(student, (o1, o2) -> {
            if (o1.h == o2.h) {
                if (o1.w == o2.w)
                    return o1.index - o2.index;
                return o2.w - o1.w;
            }
            return o2.h - o1.h;
            });

            for (int i = 0; i < n; i++) {
                System.out.println(student[i].h + " " + student[i].w + " " + student[i].index);
            }
        }
    }

    class Student {
        int h, w, index;

        public Student(int height, int weight, int index) {
            this.h = height;
            this.w = weight;
            this.index = index;
        }
    }