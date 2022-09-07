package b_practice.seminarOOP04.Ex002;

public class Main {
    public static void main(String[] args) {
        Arrays<Integer> integerArrays = new Arrays<>(1, 2, 3, 4, 5, 6);
        System.out.println(integerArrays.avg());

        Arrays<Double> doubleArrays = new Arrays<>(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        System.out.println(integerArrays.avg());

//        Arrays<String> stringArrays .... // так работать не будет.

//        if(integerArrays.sameAvg(doubleArrays)) { Arrays<T> - так не работает.
//        if(integerArrays.sameAvg(doubleArrays)) { Arrays<?> - так работает.
        if(integerArrays.sameAvg(doubleArrays)) {
            System.out.println("Среднее значение одинаково");
        } else {
            System.out.println("Среднее значение различное");
        }
    }
}
