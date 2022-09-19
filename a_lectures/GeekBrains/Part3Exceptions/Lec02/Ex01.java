package a_lectures.GeekBrains.Part3Exceptions.Lec02;

public class Ex01 {
    public static void main(String[] args) {
        int number = 1;
        try {
            String test = null;
            System.out.println(test.length());
            number = 10 / 0;
            // Если так сделать, то компиляция не пройдет
            // так как Java понимает, что после Exception ни чего не выполниться
//        } catch ( Exception e ) {
//            System.out.println("Exception");
        } catch (ArithmeticException e) {
            System.out.println("divide by zero!");
        } catch (NullPointerException e) {
            System.out.println("null");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.printf("number=%d%n", number);
    }
}
