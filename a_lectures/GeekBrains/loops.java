package a_lectures.GeekBrains;

public class loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void loopForEach(){
        String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
        for (String item: arr) {
           System.out.println(item);
        }
    }
}
