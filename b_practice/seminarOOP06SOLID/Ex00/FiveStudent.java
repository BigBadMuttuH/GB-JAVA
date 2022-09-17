package b_practice.seminarOOP06SOLID.Ex00;

public class FiveStudent extends Student {
    public FiveStudent(String fullName, int mark) {
        super(fullName, mark);
    }

    @Override
    public void answerOnTheLesson() {
        System.out.println(getFullName() + " - отличник тянет руку");
    }
}
