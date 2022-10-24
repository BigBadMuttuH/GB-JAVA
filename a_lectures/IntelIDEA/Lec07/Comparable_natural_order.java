package a_lectures.IntelIDEA.Lec07;

public class Comparable_natural_order {
    public static void main(String[] args) {

    }
    class User implements Comparable<User> {
        final String name;

        User(String name) {this.name = name; }

        @Override
//        public int compareTo(@NotNull User o) {
        public int compareTo(User o) {
            return name.compareTo(o.name);
        }
    }
}
