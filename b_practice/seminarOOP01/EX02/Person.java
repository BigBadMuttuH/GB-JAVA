package b_practice.seminarOOP01.EX02;

import java.util.ArrayList;
import java.util.Objects;

public class Person {
    public String fullName;
    private ArrayList<Person> family = new ArrayList<>();

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void appendToFamily(Person person) {
        if (person != null
                && person != this
                && person.fullName != "") {
            family.add(person);
        }
    }

    public ArrayList<Person> getFamily() {
        return family;
    }
}
