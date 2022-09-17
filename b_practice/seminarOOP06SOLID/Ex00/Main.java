package b_practice.seminarOOP06SOLID.Ex00;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Bob", 5);
        Student student2 = new Student("Mark", 4);
        Student student3 = new Student("John", 3);
        Student student4 = new Student("Vlad", 2);
        Student student5 = new FiveStudent("Anton", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        for (Student st :
//                students) {
//            if (st.getMark() == 5) {
//                System.out.println(st.getFullName() + " тянет руку изо всех сил");
//            } else if (st.getMark() == 4) {
//                System.out.println(st.getFullName() + " не тянет руку изо всех сил");
//            }
            /// И так далее!
            // Это плохая практика
            // нужно сделать класс Отличников, Хорошистов, Трошников и т.д.
            // унаследовав их всех от Student
//        }

        // тогда все будет выглядеть вот так.
        for (Student st : students) {
            st.answerOnTheLesson();
        }
    }
}
