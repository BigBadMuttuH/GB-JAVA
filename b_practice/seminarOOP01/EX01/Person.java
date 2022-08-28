package b_practice.seminarOOP01.EX01;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;   //
        this.age = age;
    }

    public void iLike() {
        System.out.println("Меня зовут "
                + name + ", мне " + age + " лет. "
                + "И, я люблю пить!");
    }
}
