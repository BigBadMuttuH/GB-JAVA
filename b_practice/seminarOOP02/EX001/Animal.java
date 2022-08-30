package b_practice.seminarOOP02.EX001;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
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
//  abstreact - это то, что нужно будет потом переопределить.
}
