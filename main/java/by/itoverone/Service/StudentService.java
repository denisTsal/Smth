package by.itoverone.Service;

import by.itoverone.entity.Human;
import by.itoverone.entity.Student;

import java.util.*;

public class StudentService extends Student {
    public List<Student> getStudents() {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("введите кол-во студентов");
        int numOfStudents = sc.nextInt();
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("введите имя ученика");
            String name = sc.next();
            System.out.println("введите кол-во предметов");
            int numOfSubject = sc.nextInt();
            Map<String, List<Integer>> marks = new HashMap<>();
            for (int j = 0; j < numOfSubject; j++) {
                System.out.println("введите название предмета");
                String nameOfSubject = sc.next();
                System.out.println("введите кол-во оценок по предмету");
                int numOfMarks = sc.nextInt();
                List<Integer> studentsMarks = new ArrayList<>();
                for (int k = 0; k < numOfMarks; k++) {
                    System.out.println("введите отметку");
                    int mark = sc.nextInt();
                    studentsMarks.add(mark);
                }
                marks.put(nameOfSubject, studentsMarks);
            }
            students.add(new Student(name, marks));
        }
        return students;

    }



    public List<Student> getStudWithAVG7(List<Student>students) {
        List<Student> stWith7 = new ArrayList<>();
        for (Student st : students) {
            Map<String, List<Integer>> stMarks = st.getMarks();
            for (Map.Entry<String, List<Integer>> pair : stMarks.entrySet()) {
                String subjName = pair.getKey();
                List<Integer> subjMarks = pair.getValue();
                int sum = 0;
                for (int i = 0; i < subjMarks.size(); i++) {
                    sum = sum + subjMarks.get(i);
                    int avg = sum / subjMarks.size();
                    if (avg > 7) {
                        stWith7.add(st);
                        break;
                    }
                }

            }
        }
        return stWith7;
    }



}

