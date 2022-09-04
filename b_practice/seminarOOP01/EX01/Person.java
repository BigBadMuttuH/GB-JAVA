package b_practice.seminarOOP01.EX01;

/**
 * Основной класс
 * */
public class Person {
    public String name;
    public int age;

    /**
     * @param age  возраст
     * @param name  имя
     * */
    public Person(String name, int age) {
        this.name = name;   //
        this.age = age;
    }

    /**
     * Я люблю пить
     * */
    public void iLike() {
        System.out.println("Меня зовут "
                + name + ", мне " + age + " лет. "
                + "И, я люблю пить!");
    }
}
