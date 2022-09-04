package b_practice.seminarOOP01.EX01;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Дарья", 20);
//        CoffeeMan coffeeMan = new CoffeeMan("Владимир", 30);
//        TeaMan teaMan = new TeaMan("Андрей", 28);
//        так тоже работает
        Person coffeeMan = new CoffeeMan("Владимир", 30);
        Person teaMan = new TeaMan("Андрей", 28);
//        person.iLike();
//        coffeeMan.iLike();
//        teaMan.iLike();
//        все это можно переписать, запихнув это все в коллекцию
        List<Person> personList = Arrays.asList(person, teaMan, coffeeMan);
//      personList + ATL+Enter --> Iterate
        for (Person p : personList) {
           p.iLike();
        }
        // если закомментировать метод в одном из наследуемых классах,
        // то сработает метод из основного класса.

        // механизм позднего(запоздалого) связывания
    }
}
/**
* @... Аннотация
* Меня зовут Дарья, мне 20лет. И, я люблю пить!
* Меня зовут Владимир, мне 30лет. И, я люблю пить КОФЕЕ!!!
* Меня зовут Андрей, мне 28лет. И, я люблю пить ЧАЙ!
*/