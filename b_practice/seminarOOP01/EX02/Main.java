package b_practice.seminarOOP01.EX02;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Иван Иванович Иванов");
        Person secondPerson = new Person("Перт Петрович Иванов");
        Person thirdPerson = new Person("Василий Васильевич Иванов");
        Person none = new Person("");

        firstPerson.appendToFamily(firstPerson);
        firstPerson.appendToFamily(secondPerson);
        firstPerson.appendToFamily(thirdPerson);
        firstPerson.appendToFamily(none);

        view(firstPerson);
    }

    static void view(Person rootPerson) {
        System.out.println(rootPerson.getFullName());
        for (Person person : rootPerson.getFamily()) {
            if(person != null) {
                view(person);
            }
        }
    }
}
