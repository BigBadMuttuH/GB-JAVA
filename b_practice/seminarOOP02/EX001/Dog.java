package b_practice.seminarOOP02.EX001;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println(this.getName() + ": Гав-Гав!");
    }
}
