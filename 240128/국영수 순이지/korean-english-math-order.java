import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            student[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(student, (o1, o2) -> {
            if (o2.kor == o1.kor) {
                if (o2.eng == o1.eng)
                    return o2.math - o1.math;
                return o2.eng - o1.eng;
            }
            return o2.kor - o1.kor;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(student[i].name + " " + student[i].kor + " " + student[i].eng + " " + student[i].math);
        }
    }
}

class Student {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}