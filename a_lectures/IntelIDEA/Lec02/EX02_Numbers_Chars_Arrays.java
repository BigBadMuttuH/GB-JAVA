package a_lectures.IntelIDEA.Lec02;

/**
 Значения и их типы
 Логические:     boolean;
 Целочисленные:  byte, short, int, long;
 Дробные:        float, double; - не пользуйтесь float без причины
 Символьные:     char;
 Ссылочные:      Null, Object, .... heap - в ней храниться ссылка на какой-то объект


 */

public class EX02_Numbers_Chars_Arrays {
    public static void main(String[] args) {
        int a = 123;
        long b = 9_876_543_210L;
        var c = 0x1234_ABCD;  // шестнадцатеричное число
        var d = 0xFFFF_FFFF;  // шестнадцатеричное число
        var e = 0123;         // восьмеричное число
        var f = 0b1010_1010_0000_1111; // двоичное число
/*        2/3 = 0; 2.0/3 = 0.6666...
       "akfj".hashCode()
//         тут какой-то комментарий и неожиданно \u000a System.out.println("Bugagag");
       Character.isDigit('5️⃣')
       +0.0, -0.0 вроде как равны, но через toString() нет.
       NaN(Double.Nan) - не больше, ни меньше, не равно самому себе и какому-либо числу.
       double x = Double.Nan
       Double.isNaN(x) ==> true

*/
        double aa = Long.MAX_VALUE;
        long bb = Long.MAX_VALUE;
        int cc = 1;
        System.out.println(aa + bb + cc); // long + long + int - все норм
        System.out.println(cc + bb + aa); // int + long + long - проблема(переполнение int), избегайте такое!

        /**
         * Массивы — это объекты — ссылочный тип.
         * в куче: [заголовок | длина | 0 | 1 | 2 | 3 ]
         * - массивы, низкоуровневая вещь, которой стараются пользоваться как можно реже.
         * двумерные массивы: int[][] initializedTable = {{1,2,3}, {4,5},{6}}
         * [ заголовок | L = 3 | 0 | 1 | 2
         *                       заголовок L=3 1, 2, 3
         *                           заголовок L=2 4, 5
         *                               заголовок L=1 6
         *
         */
    }
}
