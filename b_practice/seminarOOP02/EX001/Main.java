package b_practice.seminarOOP02.EX001;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Евгений");
        Cat cat = new Cat("Барсик", 1);
        Dog dog = new Dog("Полкан", 2);
        human.animals.add(cat);
        human.animals.add(dog);

//        cat.voice();
//        dog.voice();

//        human.printAnimals();

        human.print(human.animals);
    }
}
