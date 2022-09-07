package b_practice.seminarOOP04.Ex001;

public class Box <T> {

    // T - для типа (String, Int, ....
    // E - означает элемент, но не тип.
    // K,V - ключ, значение
    // ? - неопределенный тип - мета символы

    // Чтобы вас понимали, нужно использовать вот это.
    // Обобщения работают только со ссылочными типами.


    // ни один статический метод не может использовать Т

    private T object;

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void showType() {
        System.out.println("Тип T:" + object.getClass().getName());
    }

}
