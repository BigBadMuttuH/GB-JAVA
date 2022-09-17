package b_practice.seminarOOP06SOLID.Ex00;

public class Student {
    private String fullName;
    private int mark;

    public Student(String fullName, int mark) {
        this.fullName = fullName;
        this.mark = mark;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMark() {
        return mark;
    }
    // студент должен отвечать только сам за себя
    // задача сохранения, не его задача
//    public void saveStudent(Student student) {
//        // do save in list
//    }
    public void answerOnTheLesson() {
        System.out.println(this.getFullName() + " тянет руку изо всех сил");
    }
}
