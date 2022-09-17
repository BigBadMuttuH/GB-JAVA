package b_practice.seminarOOP07SOLID.Ex01.db;

public interface Exporter {

    default void save(String path) {
        System.out.println("Сохраняем");
    }
}
