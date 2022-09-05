package b_practice.seminarOOP03.EX03;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Map<String, Integer> pillows = new HashMap<>();
        Map<Enum, String> diseases = new HashMap<>();

        Student student1 = new Student("Иванов", 8, true);
        Student student2 = new Student("Петров", 7, false);
        Student student3 = new Student("Сидоров", 16, true);
        Student student4 = new Student("Козлов", 10, false);
        Student student5 = new Student("Чапаев", 20, false);
        Student student6 = new Student("Баранов", 17, true);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        pillows.put("Уголь", 100_000);
        pillows.put("Аспирин", 10);
        pillows.put("Зеленка", 100);

        Nurse nurse = new Nurse(students, pillows);

        nurse.goToCheckup(nurse.getStudents());
    }
}
