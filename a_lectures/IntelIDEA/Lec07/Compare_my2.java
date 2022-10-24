package a_lectures.IntelIDEA.Lec07;


public class Compare_my2 {
    public static void main(String[] args) {

    }
    static class User implements Comparable<User> {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int compareTo(User o) {
            int res = name.compareTo(o.name);
            return res == 0 ? Integer.compare(this.age, o.age) : res;
        }

        public String toString() { return  name+ ": "+ age; }
    }
}
