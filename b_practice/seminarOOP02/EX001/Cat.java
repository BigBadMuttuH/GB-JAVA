package b_practice.seminarOOP02.EX001;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void voice(){
        System.out.println(this.getName() + ": Мяу-Мяу.");
    }
}
