package a_lectures.GeekBrains.oop.lecture2.Ex004;

public class Druid extends BaseHero {
    int mn;

    public Druid(String name, int hp, int mn) {
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");
        this.mn = mn;
//        можно переопределить hp
//        this.hp = (int)(this.hp * 0.8);
    }

    public Druid() {
        this("", 0, 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}