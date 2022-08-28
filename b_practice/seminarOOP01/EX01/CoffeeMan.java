package b_practice.seminarOOP01.EX01;

public class CoffeeMan extends Person {
    public CoffeeMan(String name, int age) {
        super(name, age); // наследник от Person
    }

    @Override // вот это вот -
    public void iLike() {
        System.out.println("Меня зовут "
                + name + ", мне " + age + " лет. "
                + "И, я люблю пить КОФЕЕ!!!");
    }
}
