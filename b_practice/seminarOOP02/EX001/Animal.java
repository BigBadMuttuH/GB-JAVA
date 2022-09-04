package b_practice.seminarOOP02.EX001;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s, возраст %d г.",
                this.getClass().getSimpleName(), this.name, this.age);
    }

    //  abstreact - это то, что нужно будет потом переопределить.
    public abstract void voice();
}
