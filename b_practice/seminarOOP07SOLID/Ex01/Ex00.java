package b_practice.seminarOOP07SOLID.Ex01;

import b_practice.seminarOOP07SOLID.Ex01.db.DB;

import java.util.ArrayList;
import java.util.List;

public class Ex00 {
    public static void main(String[] args) {
        DB dbLoader = new DB();
        dbLoader.load("http://localhost", "admin", "Pa@sw0rd");


    }
}

class Planer {
    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join("\n", entries);
    }
}
