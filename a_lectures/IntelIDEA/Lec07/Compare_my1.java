package a_lectures.IntelIDEA.Lec07;

public class Compare_my1 {
    public static void main(String[] args) {

    }
    static class User implements Comparable<User> {
        private boolean valid;

        User(boolean valid) { this.valid = valid; }

        boolean isValid() { return valid; }

        // так не надо, потому что нет ни где равенства
        // мы не возвращаем ни чего при равенстве объектов
//        public int compareTo(User o) {
//            return this.valid && !o.valid ? 1 : -1;
//        }

        // правильно не изобретать велосипед, а воспользоваться Boolean.compare
        public int compareTo(User o) {
            return Boolean.compare(this.valid, o.valid);
        }
        // забегая далее
        // для сравнения integers можно применять также стандартный метод
        // Integer.compare(this.age, o.age);
        // и для других вещей тоже
        // Double.compare(this.

        public String toString() { return  String.valueOf(valid); }
    }
}
