package b_practice.seminarOOP07SOLID.Ex01.db;

public interface Importer {
    default void load(String path){
        System.out.println("Загружаем");
    }
}
