package b_practice.seminarOOP01.EX01;

public class TeaMan extends Person{

    public TeaMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void iLike() {
        System.out.println("Меня зовут "
                + name + ", мне " + age + " лет. "
                + "И, я люблю пить ЧАЙ!");
    }
}
